package whq.smartplm.domain.kafka;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PlmEcrCoverPageRepository extends JpaRepository<PlmEcrCoverPageEntity, Long>{

    //find ECR data by ECR No
    List<PlmEcrCoverPageEntity> findByecrNo(String ecrNo);

}
