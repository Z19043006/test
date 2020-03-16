package whq.smartplm.domain.kafka;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 2 * @Author: Daji Chen
 * 3 * @Date: 2020/3/2 16:25
 * 4
 */
@Repository
public interface PlmEcrApprovalRepository extends JpaRepository<PlmEcrApprovalLogEntity,Long> {

    List<PlmEcrApprovalLogEntity> findByecrNo(String ecrNo);

}
