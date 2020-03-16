package whq.smartplm;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import whq.smartplm.controller.ApiResponse;
import whq.smartplm.domain.common.*;
import whq.smartplm.domain.eco.*;
import whq.smartplm.domain.kafka.*;
import whq.smartplm.domain.model.*;
import whq.smartplm.service.*;


import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class PlmServiceTest {
    @Autowired
    EcrService ecrService;
    @Autowired
    EcoService ecoService;
    @Autowired
    PlmProductlineRepository plmProductlineRepository;
    @Autowired
    PlmCusnicknameRepository plmCusnicknameRepository;
    @Autowired
    PlmSitetabRepository plmSitetabRepository;
    @Autowired
    EcoTaskAssignerRepository ecoTaskAssignerRepository;

    public final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void findAllProductdesc() throws Exception {
        try {
            logger.info(plmProductlineRepository.findAllProductdesc().toString());
        }catch (Exception e){
            logger.info(e.getMessage());
        }
    }

    @Test
    public void findAllNickname() throws Exception {
        try {
            logger.info(plmCusnicknameRepository.findAllNickname().toString());
        }catch (Exception e){
            logger.info(e.getMessage());
        }
    }

    @Test
    public void findPlantByTaskAssigner() throws Exception {
        try {
            List<String> planList = ecoTaskAssignerRepository.findPlantByEmployeeNo("MC15070010");
            logger.info(plmSitetabRepository.findByUccsitenameIn(planList).toString());
        }catch (Exception e){
            logger.info(e.getMessage());
        }
    }

    @Test
    public void testGetDisplayCustomer() throws Exception {
        try {
            List<String> List = plmCusnicknameRepository.findNickNameByCustomerName("Anyo Pioneer");
            System.out.println(List);
        }catch (Exception e){
            logger.info(e.getMessage());
        }
    }

}
