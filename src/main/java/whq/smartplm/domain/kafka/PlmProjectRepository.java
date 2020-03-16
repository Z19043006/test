package whq.smartplm.domain.kafka;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlmProjectRepository extends JpaRepository<PlmProjectEntity, Long> {
    PlmProjectEntity findOneByProjectName(String projectName);

}
