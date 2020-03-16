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
import whq.smartplm.domain.common.BasAccountEntity;
import whq.smartplm.domain.common.PlmProductlineEntity;
import whq.smartplm.domain.common.PlmProductlineRepository;
import whq.smartplm.domain.eco.EcoFlowTemplateEntity;
import whq.smartplm.domain.eco.EcoTaskAssignerEntity;
import whq.smartplm.domain.kafka.PlmEcrApprovalLogEntity;
import whq.smartplm.domain.kafka.PlmEcrCoverPageEntity;
import whq.smartplm.domain.model.RoleListDisplay;
import whq.smartplm.service.EcoService;
import whq.smartplm.service.EcrService;
import whq.smartplm.service.PlmService;
import whq.smartplm.util.TimeUtil;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class EcoServiceTest {
    @Autowired
    EcrService ecrService;
    @Autowired
    EcoService ecoService;
    @Autowired
    PlmService plmService;
    @Autowired
    PlmProductlineRepository plmProductlineRepository;

    private static final Logger logger = LoggerFactory.getLogger(EcoServiceTest.class);

    @Test
    public void testECRApprovallog() throws Exception {
        ApiResponse response = ecrService.getECRApprovalLog("R1900033");
        List<PlmEcrApprovalLogEntity> list = (List<PlmEcrApprovalLogEntity>) response.getData();
        Assert.assertEquals(list.size() > 0, true);
    }

    @Test
    public void testQueryECRToCreateECOFilter() throws Exception {

        Timestamp startDate=Timestamp.valueOf("2019-12-01 11:11:11");
        Timestamp endDate=Timestamp.valueOf("2020-01-01 11:11:11");
        ApiResponse response = ecrService.queryECRToCreateECOFilter("711", "MS-QM", "Acer", false, startDate, endDate);
        List<PlmEcrCoverPageEntity> list = (List<PlmEcrCoverPageEntity>) response.getData();
        Assert.assertEquals(list.size()>0, true);
    }

    @Test
    public void testQueryFlowTemplate() throws Exception {
        ApiResponse response = ecoService.queryFlowTemplate("111111");
        List<EcoFlowTemplateEntity> list = (List<EcoFlowTemplateEntity>) response.getData();
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).getSeqNo() + " " + list.get(i).getPlant() +" "+list.get(i).getRole()+ " " + list.get(i).getSequence() + " " + list.get(i).getName());
//        }
        Assert.assertEquals(list == null, true);
    }


    @Test
    public void findByProductcodeTest() {
        String productdesc = "Tech Service";
        PlmProductlineEntity product = plmProductlineRepository.findByProductdesc(productdesc);

        if (null != product)
            logger.info(product.getProductcode());
    }

    @Test
    public void testRoleListDisplay() throws Exception {
        ApiResponse response = ecoService.roleListDisplay("111111");
        List<RoleListDisplay> list = (List<RoleListDisplay>) response.getData();
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).getRole() + " " + list.get(i).getCosigner()+" "+list.get(i).getSequence());
//        }
        Assert.assertEquals(list, null);
    }

    @Test
    public void testGetECR() throws Exception {
        ApiResponse response = ecrService.getECR("111");
        List<PlmEcrCoverPageEntity> list = (List<PlmEcrCoverPageEntity>) response.getData();
        Assert.assertEquals(list, null);

    }

    @Test
    public void testGetTaskAssignerInfo() throws Exception {
        ApiResponse response = ecrService.getTaskAssignerInfo();
        List<EcoTaskAssignerEntity> list = (List<EcoTaskAssignerEntity>) response.getData();
        Assert.assertEquals(list.size() > 0, true);
    }


//    @Test
//    public void findADGroup() throws Exception {
//        ApiResponse response = ecrService.findADGroup(" ");
//        List<BasAccountEntity> list = (List<BasAccountEntity>) response.getData();
////            for (BasAccountEntity BasAccountEnt : list) {
////                System.out.println(BasAccountEnt.getEmployeeNo());
////            }
//        Assert.assertEquals(list, null);
//    }

    @Test
    public void findUserTest() {
        List<BasAccountEntity> users = ecoService.findUser("Z19043006", "daji chen", "ml7720");
        System.out.println(users.size());
    }

    @Test
    public void getRoleTest() {
        List<String> role = ecoService.getRole();
        System.out.println(role.size());
    }

}
