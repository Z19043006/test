package whq.smartplm.domain.kafka;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlmRfqprojectRepository extends JpaRepository<PlmRfqprojectEntity, Long> {
    PlmRfqprojectEntity findOneByProjectCode(String projectCode);
}
