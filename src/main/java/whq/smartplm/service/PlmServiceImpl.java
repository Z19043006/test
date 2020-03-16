package whq.smartplm.service;

import org.apache.commons.collections4.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import whq.smartplm.controller.ApiResponse;

import whq.smartplm.domain.common.*;
import whq.smartplm.domain.eco.*;

import java.util.*;


@Service
public class PlmServiceImpl implements PlmService {

    public final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PlmProductlineRepository plmProductlineRepository;
    @Autowired
    PlmCusnicknameRepository plmCusnicknameRepository;
    @Autowired
    PlmRoleRepository plmRoleRepository;
    @Autowired
    PlmSitetabRepository plmSitetabRepository;
    @Autowired
    EcoTaskAssignerRepository ecoTaskAssignerRepository;

    @Override
    public ApiResponse getPlmBaseData(String employeeNo) {

        ApiResponse response = new ApiResponse<>();
        try {
            Map<String, Object> result = new HashMap<>();
            List<String> plantForTaskAssigner = ecoTaskAssignerRepository.findPlantByEmployeeNo(employeeNo);
            if(CollectionUtils.isEmpty(plantForTaskAssigner))
                throw new Exception("Can't get taskAssigner's plant");

            List<Map<String,Object>> plantList = new ArrayList<>();
            for(PlmSitetabEntity plmSitetabEntity: plmSitetabRepository.findByUccsitenameIn(plantForTaskAssigner)) {
                Map<String, Object> plantMap = new HashMap<>();
                plantMap.put("name", plmSitetabEntity.getUccsitename());
                plantMap.put("disp", plmSitetabEntity.getUccsitenamedisp());
                plantList.add(plantMap);
            }

            List<String> prodcutlineList = plmProductlineRepository.findAllProductdesc();
            List<String> customerList = plmCusnicknameRepository.findAllNickname();
            if (CollectionUtils.isEmpty(plantList) || CollectionUtils.isEmpty(prodcutlineList) || CollectionUtils.isEmpty(customerList))
                throw new Exception("Can't get PlmBaseData");

                result.put("plant", plantList);
                result.put("productline", prodcutlineList);
                result.put("customer", customerList);
                response.setSuccess(result);

        } catch (Exception e) {
            logger.info(e.getMessage());
            response.setMessage(e.getMessage());
        } finally {
            return response;
        }
    }


    public List<String> getDisplayCustomer(String coustomer){
        ApiResponse response=new ApiResponse();
        List<String> EcoRoleNameListEntities=plmCusnicknameRepository.findNickNameByCustomerName(coustomer.trim());

        return EcoRoleNameListEntities;
    }

}
