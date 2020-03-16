package whq.smartplm.service;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import whq.smartplm.controller.ApiController;
import whq.smartplm.controller.ApiResponse;
import whq.smartplm.domain.common.*;
import whq.smartplm.domain.eco.*;
import whq.smartplm.domain.kafka.*;

import javax.persistence.EntityManager;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 2 * @Author: Daji Chen
 * 3 * @Date: 2020/3/5 10:29
 * 4
 */


@Component
public class EcrServiceImpl extends ApiController implements EcrService {
    @Autowired
    PlmEcrApprovalRepository eCRApprovalRepository;
    @Autowired
    EcoCommentRepository ecoCommentRepository;
    @Autowired
    EcoTaskAssignerRepository ecoTaskAssignerRepository;
    @Autowired
    EcoRoleNameListRepository ecoRoleNameListRepository;
    @Autowired
    EntityManager entityManager;
    @Autowired
    BasAccountRpository basAccountRpository;
    @Autowired
    PlmProductlineRepository plmProductlineRepository;
    @Autowired
    PlmEcrCoverPageRepository plmEcrCoverPageRepository;
    @Autowired
    PlmEcrAffecteditemReposity plmEcrAffecteditemReposity;


    /**
     * query ecrNo cosign history
     *
     * @param ecrNo
     * @return
     */
    @Override
    public ApiResponse getECRApprovalLog(String ecrNo) {
        ApiResponse response = new ApiResponse();
        List<PlmEcrApprovalLogEntity> list = new ArrayList<>();
        try {
            list = eCRApprovalRepository.findByecrNo(ecrNo);
            response.setSuccess(list);
        } catch (Exception e) {
            logger.error(e.getMessage());
            response.setMessage(e.getMessage());
        }
        return response;
    }

    /**
     * Filter condition:
     * 1.Plant-->affecteditem_bom_plant
     * 2.Product Line-->qmtype
     * 3.Customer-->apply_brand
     * 4.Comment-->Y/N default：ALL
     * 5.The ECR with ECN status and that in effect in the last three months,Task Assigner site of ECO (there may be several)
     * 6.return "ECR No、ECR Subject" let Issuer to choice
     *
     * @param plant
     * @param customer
     * @param product
     * @param comment
     * @return
     * @throws Exception
     */
    public ApiResponse queryECRToCreateECOFilter(String plant, String product, String customer, boolean comment, Timestamp startDate, Timestamp endDate) throws Exception {
        ApiResponse response = new ApiResponse();

        try {
            logger.info("plant: " + plant + " customer: " + customer + " productLine: " + product
                    + " comment:" + comment + " startDate: " + startDate + " endDate: " + endDate);
            List<PlmEcrCoverPageEntity> data = new ArrayList();
            Session session = entityManager.unwrap(org.hibernate.Session.class);
            Criteria criteria = session.createCriteria(PlmEcrCoverPageEntity.class);
            String toCharBefore = "to_char((now() - interval '3 Months'),'"+startDate.toString().trim()+"')";
            String toCharNow = "to_char(now(),'"+endDate.toString().trim()+"')";
            // DetachedCriteria criteria = DetachedCriteria.forClass(PlmEcrCoverPageEntity.class);
            criteria.add(Restrictions.sqlRestriction("issue_date between " + toCharBefore + "and " + toCharNow));
            criteria.add(Restrictions.and(Restrictions.isNotNull("ecnNo")));
            //SQL joint
            if (StringUtils.isNotEmpty(plant))
                criteria.add(Restrictions.and(Restrictions.eq("affecteditemBomPlant", plant.trim())));

            if (StringUtils.isNotEmpty(customer))
                criteria.add(Restrictions.and(Restrictions.eq("applyBrand", customer.trim())));

            if (StringUtils.isNotEmpty(product)) {
                PlmProductlineEntity plmProductlineEntity = plmProductlineRepository.findByProductcode(product);
                if (null != plmProductlineEntity)
                    criteria.add(Restrictions.and(Restrictions.eq("qmtype", plmProductlineEntity.getProductcode())));
            }
            data = criteria.list();

            //ECO Plant on ECR has Plant information and cannot be opened again
            //because the EcoPlant column not ready so this logic not use now
//            for(PlmEcrCoverPageEntity ecr:data){
//                if(!StringUtils.isEmpty(ecr.getEcoPlant()))
//                    data.remove(ecr);
//            }

            //SQL query result
            if (!(data.size() > 0)) {
                //no data
                response.setMessage("Could not found the match data,please check the query condition.");
            } else {
                //got data and set into response
                response.setSuccess(data);
            }

        } catch (Exception ex) {
            logger.error(ex.getMessage());
            response.setMessage(ex.getMessage());
        }
        return response;
    }

    /**
     * query ECO Task Assigner from eco_task_assigner
     * and query employee_no,chinese_name,english_name,phone_no from bas_account
     *
     * @return
     */
    public ApiResponse getTaskAssignerInfo() {
        ApiResponse response = new ApiResponse();
        try {
            List<EcoTaskAssignerEntity> list = ecoTaskAssignerRepository.findAll();
            /* and query employee_no,chinese_name,english_name,phone_no from bas_account */
            if (list.size() > 0) {
                for (int i = 0; i < list.size(); i++) {
                    List<BasAccountEntity> basAccountEntities = basAccountRpository
                            .findByEmployeeNo(list.get(i).getEmployeeNo());
                    if (basAccountEntities.size() > 0) {
                        /* add chinese_name,english_name and phone_no from bas_account */
                        list.get(i).setChineseName(basAccountEntities.get(0).getChineseName());
                        list.get(i).setEnglishName(basAccountEntities.get(0).getEnglishName());
                        list.get(i).setPhoneNo(basAccountEntities.get(0).getPhoneNo());
                    }
                }
            }
            response.setSuccess(list);
        } catch (Exception e) {
            logger.error(e.getMessage());
            response.setMessage(e.getMessage());
        }
        return response;
    }

    /**
     * get ECR info
     *
     * @param ecrNo
     * @return
     */
    @Override
    public ApiResponse getECR(String ecrNo) {
        ApiResponse response = new ApiResponse();
        List<PlmEcrCoverPageEntity> plmEcrCoverPageEntities = new ArrayList<>();
        try {
            plmEcrCoverPageEntities = plmEcrCoverPageRepository.findByecrNo(ecrNo.trim());
            if (plmEcrCoverPageEntities != null & !plmEcrCoverPageEntities.isEmpty())
                response.setSuccess(plmEcrCoverPageEntities);
            else
                response.setMessage("Could not found this ECR data.");
        } catch (Exception e) {
            logger.error(e.getMessage());
            response.setMessage(e.getMessage());
        }
        return response;
    }

    /**
     * get AffectedItem By EcoNo
     *
     * @param ecrNo
     * @return
     */
    @Override
    public List<PlmEcrAffecteditemEntity> getAffectedItemByEcoNo(String ecrNo) {

        return plmEcrAffecteditemReposity.findByecno(ecrNo);
    }
    @Override
    public ApiResponse getPLanList(String employeeNo) {
        ApiResponse response = new ApiResponse();
        List<EcoTaskAssignerEntity> EcoTaskAssignerEntities = ecoTaskAssignerRepository.findByEmployeeNoAndRole(employeeNo.trim(), "Task Assigner");
        if (EcoTaskAssignerEntities.size() > 0)
            response.setSuccess(EcoTaskAssignerEntities);
        else
            response.setMessage("Not found.");

        return response;
    }

    @Override
    public ApiResponse getCustomerList(String plant) {
        ApiResponse response = new ApiResponse();
        List<EcoRoleNameListEntity> ecoRoleNameListEntities = ecoRoleNameListRepository.findByPlant(plant.trim());
        if (ecoRoleNameListEntities.size() > 0)
            response.setSuccess(ecoRoleNameListEntities);
        else
            response.setMessage("Not found");

        return response;
    }

    @Override
    public ApiResponse getProductLineList() {
        ApiResponse response = new ApiResponse();
        List<PlmProductlineEntity> ecoRoleNameListEntities = plmProductlineRepository.findAll();
        response.setSuccess(ecoRoleNameListEntities);
        return response;
    }

    @Override
    public ApiResponse findADGroup(String adGroupName) {
        ApiResponse response = new ApiResponse<>();
        try {
            List<BasAccountEntity> basAccountEntities = basAccountRpository.findByEmployeeNoLike("%" + adGroupName.trim() + "%");
            if (basAccountEntities.size() > 0)
                response.setSuccess(basAccountEntities);
            else
                response.setMessage("Not found.");
        } catch (Exception e) {
            logger.error(e.getMessage());
            response.setMessage(e.getMessage());
        }
        return response;
    }
}
