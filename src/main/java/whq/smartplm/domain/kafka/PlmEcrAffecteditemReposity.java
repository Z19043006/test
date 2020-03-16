package whq.smartplm.domain.kafka;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 2 * @Author: Daji Chen
 * 3 * @Date: 2020/3/12 16:04
 * 4
 */
@Repository
public interface PlmEcrAffecteditemReposity extends JpaRepository<PlmEcrAffecteditemEntity, Long> {
    //query plm_ecr_affecteditem where status is not Canceled
    @Query(value = "select * from kafka.plm_ecr_affecteditem where status<>'Canceled'",nativeQuery = true)
    List<PlmEcrAffecteditemEntity> findByecno(String ecoNo);
}
