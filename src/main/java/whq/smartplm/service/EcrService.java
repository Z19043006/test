package whq.smartplm.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import whq.smartplm.controller.ApiResponse;
import whq.smartplm.domain.kafka.PlmEcrAffecteditemEntity;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * 2 * @Author: Daji Chen
 * 3 * @Date: 2020/3/5 10:29
 * 4
 */

@Transactional
@Service
public interface EcrService {
    public ApiResponse getECRApprovalLog(String ecrNo);

    public ApiResponse queryECRToCreateECOFilter(String plant, String product, String customer, boolean comment, Timestamp startDate, Timestamp endDate) throws Exception;

    public ApiResponse getTaskAssignerInfo();

    public ApiResponse getECR(String ecrNo);

    List<PlmEcrAffecteditemEntity> getAffectedItemByEcoNo(String ecrNo);

    public ApiResponse getPLanList(String employeeNo);

    public ApiResponse getCustomerList(String plant);

    public ApiResponse getProductLineList();

    public ApiResponse findADGroup(String adGroupName);

}
