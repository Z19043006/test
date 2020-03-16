package whq.smartplm.service;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import whq.smartplm.controller.*;
import whq.smartplm.domain.common.*;
import whq.smartplm.domain.eco.*;
import whq.smartplm.domain.model.*;
import whq.smartplm.domain.kafka.*;
import whq.smartplm.constant.*;


import javax.persistence.EntityManager;
import java.util.*;


@Service
public class EcoServiceImpl extends ApiController implements EcoService {

    @Autowired
    EcoCoverpageRepository ecoCoverpageRepository;
    @Autowired
    EcoCommentRepository ecoCommentRepository;
    @Autowired
    EcoRoleNameListRepository ecoRoleNameListRepository;
    @Autowired
    EcoFlowTemplateRepositiory ecoFlowTemplateRepositiory;
    @Autowired
    BasAccountRpository basAccountRpository;
    @Autowired
    EntityManager entityManager;

    /**
     * create Eco CoverPage
     *
     * @param ecoCoverpageEntity
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ApiResponse createECOCoverPage(EcoCoverpageEntity ecoCoverpageEntity) {
        ApiResponse apiResponse = new ApiResponse();
        try {
            ecoCoverpageRepository.save(ecoCoverpageEntity);
            apiResponse.setSuccess(ecoCoverpageEntity);
        } catch (Exception e) {
            logger.info("createEcoCoverPage fail");
            apiResponse.setMessage(e.getMessage());
        } finally {
            return apiResponse;
        }
    }

    /**
     * create Eco Comment
     *
     * @param ecrNo,employeeNo,comment
     * @return
     */
    @Override
    @Transactional
    public ApiResponse createECOComment(String ecrNo, String employeeNo, String comment) {
        ApiResponse response = new ApiResponse();
        try {
            EcoCommentEntity ecoCommentEntity = new EcoCommentEntity();
            ecoCommentEntity.setEcrNo(ecrNo);
            ecoCommentEntity.setEmployeeNo(employeeNo);
            ecoCommentEntity.setComment(comment);
            ecoCommentRepository.save(ecoCommentEntity);
            response.setSuccess(ecoCommentEntity);
        } catch (Exception e) {
            logger.info("createEcoComment fail");
            response.setMessage(e.getMessage());
        } finally {
            return response;
        }
    }

    /**
     * get EcoCoverPage By IssuerId
     *
     * @param issuerId
     * @return
     */
    @Override
    public List<EcoCoverpageEntity> getEcoCoverPageByIssuerId(String issuerId) {
        try {
            return ecoCoverpageRepository.findByIssuerId(issuerId);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * query flow template
     *
     * @param plant
     * @return
     */
    @Override
    public ApiResponse queryFlowTemplate(String plant) {
        ApiResponse response = new ApiResponse();
        plant = plant.trim();
        List<EcoFlowTemplateEntity> ecoFlowTemplateEntities = new ArrayList();
        if (!StringUtils.isEmpty(plant)) {
            ecoFlowTemplateEntities = ecoFlowTemplateRepositiory.findByPlant(plant);

        }
        if (ecoFlowTemplateEntities != null && !ecoFlowTemplateEntities.isEmpty()) {
            response.setSuccess(ecoFlowTemplateEntities);
        } else {
            response.setMessage("Could not found the data.");
        }
        return response;
    }

    /**
     * query role name list
     *
     * @param plant
     * @return
     */
    @Override
    public ApiResponse queryRoleNameList(String plant) {
        ApiResponse response = new ApiResponse();
        plant = plant.trim();
        List<EcoRoleNameListEntity> ecoRoleNameListEntities = new ArrayList();
        if (!StringUtils.isEmpty(plant)) {
            ecoRoleNameListEntities = ecoRoleNameListRepository.findByPlant(plant);

            if (ecoRoleNameListEntities != null && !ecoRoleNameListEntities.isEmpty()) {
                response.setSuccess(ecoRoleNameListEntities);
            } else {
                String message = "Could not found the data.";
                response.setMessage(message);
            }
        } else {
            response.setMessage("Plant could not be empty.");
        }
        return response;
    }

    /**
     * role list display
     *
     * @param plant
     * @return
     */
    @Override
    public ApiResponse roleListDisplay(String plant) {
        ApiResponse response = new ApiResponse();
        List<EcoRoleNameListEntity> ecoRoleNameListEntities = new ArrayList();
        List<EcoFlowTemplateEntity> ecoFlowTemplateEntities = new ArrayList();
        List<RoleListDisplay> roleListDisplayList = new ArrayList();
        plant = plant.trim();
        logger.info("Plant: " + plant);
        if (!StringUtils.isEmpty(plant)) {
            ecoRoleNameListEntities = ecoRoleNameListRepository.findByPlant(plant);
        }

        if (ecoRoleNameListEntities != null && !ecoRoleNameListEntities.isEmpty()) {
            for (int i = 0; i < ecoRoleNameListEntities.size(); i++) {
                RoleListDisplay roleListDisplay = new RoleListDisplay();
                String employeeNo = ecoRoleNameListEntities.get(i).getEmployeeNo();
                logger.info("employeeNo: " + employeeNo);
                ecoFlowTemplateEntities = ecoFlowTemplateRepositiory.findByPlantAndRole(plant, ecoRoleNameListEntities.get(i).getEcoRole());

                String englishName = null;

                List<BasAccountEntity> basAccountEntities = basAccountRpository.findByEmployeeNo(employeeNo.trim());

                if (ecoFlowTemplateEntities.size() > 0) {
                    roleListDisplay.setRole(ecoRoleNameListEntities.get(i).getEcoRole());
                    roleListDisplay.setSequence(ecoFlowTemplateEntities.get(0).getSequence());
                    roleListDisplay.setCosigner(basAccountEntities.get(0).getEnglishName());
                    roleListDisplayList.add(roleListDisplay);
                }

            }
            response.setSuccess(roleListDisplayList);
        } else {
            response.setMessage("Could not found the data.");
        }
        return response;
    }

    /**
     * get user by employeeno,employeename,employeedept
     *
     * @param employeeNo
     * @param employeeName
     * @param employeeDept
     * @return
     */
    @Transactional
    @Override
    public List<BasAccountEntity> findUser(String employeeNo, String employeeName, String employeeDept) {
        Session session = entityManager.unwrap(org.hibernate.Session.class);
        Criteria criteria = session.createCriteria(BasAccountEntity.class);
        List<BasAccountEntity> list = new ArrayList<>();
        if (org.apache.commons.lang3.StringUtils.isNotEmpty(employeeNo))
            criteria.add(Restrictions.eq("employeeNo", employeeNo.trim()));

        if (org.apache.commons.lang3.StringUtils.isNotEmpty(employeeName))
            criteria.add(Restrictions.eq("englishName", employeeName.trim().toUpperCase()));

        if (org.apache.commons.lang3.StringUtils.isNotEmpty(employeeDept)) {
            criteria.add(Restrictions.eq("dept", employeeDept.trim().toUpperCase()));
        }
        list = criteria.list();
        return list;
    }

    /**
     * get distinct role from ccm.eco_flow_template
     *
     * @return
     */
    @Override
    public List<String> getRole() {
        //get all distinct role
        return ecoFlowTemplateRepositiory.getRole();
    }
}
