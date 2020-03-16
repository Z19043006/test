package whq.smartplm.service;

import org.springframework.stereotype.Service;
import whq.smartplm.controller.ApiResponse;
import whq.smartplm.domain.common.*;

import java.util.List;

@Service
public interface PlmService {
    ApiResponse getPlmBaseData(String employeeNo);
    List<String> getDisplayCustomer(String customer);
}
