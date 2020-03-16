package whq.smartplm.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import whq.smartplm.domain.common.PlmCusnicknameEntity;
import whq.smartplm.service.PlmService;

import java.util.List;

@RestController
public class PlmController extends ApiController{
    @Autowired
    PlmService plmService;

    @ApiOperation(value = "getPlmBaseData")
    @PostMapping(value = "ccm/getPlmBaseData")
    public ApiResponse getPlmBaseData(
            @RequestParam("employeeNo") String employeeNo)
    {
        ApiResponse response = new ApiResponse();
        try {
            response = plmService.getPlmBaseData(employeeNo);
        } catch (Exception e) {
            logger.error(e.getMessage());
            response.setMessage(e.getMessage());
        }
        return response;

    }

//    @ApiOperation(value = "getDisplayCustomer")
//    @PostMapping(value = "ccm/getDisplayCustomer")
//    public ApiResponse getDisplayCustomer(
//            @RequestParam("customer ") String customer )
//    {
//        ApiResponse response = new ApiResponse();
//        try {
//            List<String> list= plmService.getDisplayCustomer(customer);
//            response.setSuccess(list);
//        } catch (Exception e) {
//            logger.error(e.getMessage());
//            response.setMessage(e.getMessage());
//        }
//        return response;
//    }
}
