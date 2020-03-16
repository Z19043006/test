package whq.smartplm.domain.kafka;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlmAllpartsRepository extends JpaRepository<PlmAllpartsEntity, Long> {
    PlmAllpartsEntity findOneByPartNumber(String partNumber);
}

