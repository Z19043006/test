package whq.smartplm.domain.eco;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 2 * @Author: Daji Chen
 * 3 * @Date: 2020/3/11 15:31
 * 4
 */
@Repository
public interface EcoTaskAssignerRepository extends JpaRepository<EcoTaskAssignerEntity,Long>{
    List<EcoTaskAssignerEntity> findByEmployeeNoAndRole(String emplpyeeNo,String role);

    @Query(value = "select plant from ccm.eco_task_assigner where employee_no = ?1" , nativeQuery = true)
    List<String> findPlantByEmployeeNo(String employeeNo);

}
