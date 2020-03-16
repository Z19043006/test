package whq.smartplm.controller;

import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import whq.smartplm.domain.common.BasAccountEntity;
import whq.smartplm.domain.eco.EcoCoverpageEntity;
import whq.smartplm.domain.kafka.PlmEcrAffecteditemEntity;
import whq.smartplm.service.EcoService;
import whq.smartplm.service.EcrService;
import whq.smartplm.service.PlmService;
import whq.smartplm.util.TimeUtil;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class EcoController extends ApiController {

    @Autowired
    EcrService ecrService;
    @Autowired
    EcoService ecoService;
    @Autowired
    PlmService plmService;

    @ApiOperation(value = "get ECR Cosign Hsitory)")
    @GetMapping(value = "ccm/getECRCosignHsitory")
    public ApiResponse getECRCosignHsitory(@RequestParam("ecrNo") String ecrNo) {
        ApiResponse response = new ApiResponse();
        logger.info("getECRApprovalLog start...");
        try {
            if (StringUtils.isBlank(ecrNo)) {
                throw new NullPointerException("ecrNo can't be null");
            } else {
                response = ecrService.getECRApprovalLog(ecrNo);
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return response;
    }

    @ApiOperation(value = "getECRListFilter")
    @PostMapping(value = "ccm/getECRListFilter")
    public ApiResponse getECRListFilter(
            @RequestParam(value = "plant") String plant,
            @RequestParam(value = "product", required = false) String product,
            @RequestParam(value = "customer", required = false) String customer,
            @RequestParam(value = "comment", required = false) boolean comment,
            @RequestParam(value = "startDate") Date startDate, @RequestParam(value = "endDate") Date endDate) {

        ApiResponse response = new ApiResponse();
        try {
            logger.info("getECRListFilter start...");
            response = ecrService.queryECRToCreateECOFilter(plant, product, customer, comment,
                    TimeUtil.dateToTimestamp(startDate), TimeUtil.dateToTimestamp(endDate));
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            response.setMessage(ex.getMessage());
        }
        logger.info("getECRListFilter end...");
        return response;
    }


    @ApiOperation(value = "createECOCoverPage")
    @PostMapping(value = "ccm/createECOCoverPage")
    public ApiResponse createECOCoverPage(
            EcoCoverpageEntity ecoCoverpageEntity) {
        ApiResponse response = new ApiResponse();
        try {
            response = ecoService.createECOCoverPage(ecoCoverpageEntity);
        } catch (Exception e) {
            logger.info(e.getMessage());
            response.setMessage(e.getMessage());
        }
        return response;
    }


    @ApiOperation(value = "createECOComment")
    @PostMapping(value = "ccm/createECOComment")
    public ApiResponse createECOComment(
    @RequestParam(value = "ecrNo", required = false) String ecrNo,
    @RequestParam(value = "employeeNo", required = false ) String employeeNo,
    @RequestParam(value = "comment" , required = false) String comment)
    {
        ApiResponse response = new ApiResponse();
        try {
            response = ecoService.createECOComment(ecrNo,employeeNo,comment);
        } catch (Exception e) {
            logger.info(e.getMessage());
            response.setMessage(e.getMessage());
        }
        return response;
    }

//    @ApiOperation(value = "set ECOFlow Tamplate)")
//    @PostMapping(value = "ccm/setECOFlowTamplate")
//    public ApiResponse setECOFlowTamplate(
//            @RequestParam("seq") String seq,
//            @RequestParam("coSigner") String coSigner,
//            @RequestParam("role") String role) {
//        ApiResponse response = new ApiResponse();
//        logger.info("modifyECOFlowTamplate start...");
//        try {
//            if (StringUtils.isBlank(seq) || StringUtils.isBlank(coSigner) || StringUtils.isBlank(role)) {
//                throw new NullPointerException("seq or coSigner or role can't be null");
//            } else {
//                //Daji chen add
//                //todo:update ECO flow tamplate
//                logger.info("todo update ECO flow tamplate");
//                //response.setStatusOK(0, "todo update ECO flow tamplate", "");
//            }
//        } catch (Exception e) {
//            logger.error(e.getMessage());
//            response.setMessage(e.getMessage());
//        }
//        return response;
//    }

    @ApiOperation(value = "getFLowTamplete")
    @GetMapping(value = "ccm/getFLowTamplete")
    public ApiResponse getFLowTamplete(@RequestParam("plant") String plant) {
        ApiResponse response = new ApiResponse();
        try {
            logger.info("getFLowTamplete start...");
            response = ecoService.queryFlowTemplate(plant);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            response.setMessage(ex.getMessage());
        }
        logger.info("getFLowTamplete end...");
        return response;
    }

    @ApiOperation(value = "getRoleNameList")
    @GetMapping(value = "ccm/getRoleNameList")
    public ApiResponse getRoleNameList(@RequestParam("plant") String plant) {
        ApiResponse response = new ApiResponse();
        try {
            logger.info("getRoleNameList start...");
            response = ecoService.queryRoleNameList(plant);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            response.setMessage(ex.getMessage());
        }
        logger.info("getRoleNameList end...");
        return response;
    }

    @ApiOperation(value = "get Task Assigner Info(englishName,chineseName,employeeNo,plant,phoneNumber)")
    @GetMapping(value = "ccm/getTaskAssignerInfo")
    public ApiResponse getTaskAssignerInfo() {
        ApiResponse response = new ApiResponse();
        logger.info("getTaskAssignerInfo start...");
        try {
            response = ecrService.getTaskAssignerInfo();
        } catch (Exception e) {
            logger.error(e.getMessage());
            response.setMessage(e.getMessage());
        }
        return response;
    }

    @ApiOperation(value = "roleListDisplay")
    @GetMapping(value = "ccm/roleListDisplay")
    public ApiResponse roleListDisplay(@RequestParam("plant") String plant) {
        ApiResponse response = new ApiResponse();
        try {
            logger.info("roleListDisplay start...");
            response = ecoService.roleListDisplay(plant);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            response.setMessage(ex.getMessage());
        }
        logger.info("roleListDisplay end...");
        return response;
    }

    @ApiOperation(value = "getECR")
    @GetMapping(value = "ccm/getECR")
    public ApiResponse getECR(@RequestParam("ecrNo") String ecrNo) {
        ApiResponse response = new ApiResponse();
        try {
            logger.info("getECR start...");
            response = ecrService.getECR(ecrNo);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            response.setMessage(ex.getMessage());
        }
        logger.info("getECR end...");
        return response;
    }

    @ApiOperation(value = "find User's employeeno,employeename,employeedept,phonenumber,email")
    @PostMapping(value = "ccm/findUser")
    public ApiResponse findUser(
            @RequestParam(required = false) String employeeNo,
            @RequestParam(required = false) String employeeName,
            @RequestParam(required = false) String employeeDept) {
        ApiResponse response = new ApiResponse();
        try {
            if (StringUtils.isBlank(employeeNo) && StringUtils.isBlank(employeeName)
                    && StringUtils.isBlank(employeeDept)) {
                throw new IllegalArgumentException("At least one parameter is not empty!");
            }
            List<BasAccountEntity> list = ecoService.findUser(employeeNo, employeeName, employeeDept);
            response.setSuccess(list);
        } catch (Exception e) {
            logger.error(e.getMessage());
            response.setMessage(e.getMessage());
        }

        return response;
    }

    @ApiOperation(value = "get all distinct role")
    @GetMapping(value = "ccm/getRole")
    public ApiResponse getRole() {
        ApiResponse response = new ApiResponse();
        try {
            List<String> list = ecoService.getRole();
            response.setSuccess(list);
        } catch (Exception e) {
            logger.error(e.getMessage());
            response.setMessage(e.getMessage());
        }

        return response;
    }

    @ApiOperation(value = "getAffectedItem")
    @GetMapping(value = "ccm/getAffectedItem")
    public ApiResponse getAffectedItem(@RequestParam("ecrNo") String ecrNo) {
        ApiResponse response = new ApiResponse();
        try {
            if (StringUtils.isBlank(ecrNo)) {
                throw new NullPointerException("ecrNo can't be empty");
            } else {
                List<PlmEcrAffecteditemEntity> list = ecrService.getAffectedItemByEcoNo(ecrNo);
                response.setSuccess(list);
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            response.setMessage(e.getMessage());
        }
        return response;
    }
//    @ApiOperation(value = "getPLanList")
//    @GetMapping(value = "ccm/getPLanList")
//    public ApiResponse getPLanList(@RequestParam("EmployeeNo") String employeeNo) {
//        ApiResponse response = new ApiResponse();
//        try {
//            response= ecrService.getPLanList(employeeNo);
//        } catch (Exception e) {
//            logger.error(e.getMessage());
//            response.setMessage(e.getMessage());
//        }
//        return response;
//    }
//
//    @ApiOperation(value = "getCustomerList")
//    @GetMapping(value = "ccm/getCustomerList")
//    public ApiResponse getCustomerList(@RequestParam("Plant") String plant) {
//        ApiResponse response = new ApiResponse();
//        try {
//            response = ecrService.getCustomerList(plant);
//        } catch (Exception e) {
//            logger.error(e.getMessage());
//            response.setMessage(e.getMessage());
//        }
//
//        return response;
//    }
//
//    @ApiOperation(value = "getProductLineList")
//    @GetMapping(value = "ccm/getProductLineList")
//    public ApiResponse getProductLineList() {
//        ApiResponse response = new ApiResponse();
//        try {
//            response= ecrService.getProductLineList();
//        } catch (Exception e) {
//            logger.error(e.getMessage());
//            response.setMessage(e.getMessage());
//        }
//        return response;
//    }

    @ApiOperation(value = "findADGroup")
    @PostMapping(value = "ccm/findADGroup")
    public ApiResponse findADGroup(
            @RequestParam("adGroupName") String adGroupName)
    {
        ApiResponse response = new ApiResponse();
        try {
            response = ecrService.findADGroup(adGroupName);
        } catch (Exception e) {
            logger.info(e.getMessage());
            response.setMessage(e.getMessage());
        }
        return response;
    }
}

