package whq.smartplm.service;

import org.springframework.stereotype.Service;
import whq.smartplm.controller.ApiResponse;
import whq.smartplm.domain.common.BasAccountEntity;
import whq.smartplm.domain.eco.EcoCommentEntity;
import whq.smartplm.domain.eco.EcoCoverpageEntity;

import java.util.List;

@Service
public interface EcoService {
    ApiResponse createECOCoverPage(EcoCoverpageEntity ecoCoverpageEntity);

    ApiResponse createECOComment(String ecrNo, String employeeNo, String comment);

    ApiResponse queryFlowTemplate(String plant);

    ApiResponse queryRoleNameList(String plant);

    ApiResponse roleListDisplay(String plant);

    List<EcoCoverpageEntity> getEcoCoverPageByIssuerId(String issuerId);

    List<BasAccountEntity> findUser(String employeeNo, String employeeName, String employeeDept);

    List<String> getRole();
}
