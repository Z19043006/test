package whq.smartplm.domain.kafka;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlmAllMfrPartsRepository extends JpaRepository<PlmAllMfrPartsEntity,Long> {
    @Query(value = "select * from kafka.plm_allmfrparts am,public.manufacturer m where am.partnumber = ?1 and am.manufacturer = m.manufacturer and m.state='ACTIVE'", nativeQuery = true)
    List<PlmAllMfrPartsEntity> findByPartNumber(String partNumber);

    @Query(value = "select manufacturerpn from kafka.plm_allmfrparts am,public.manufacturer m where am.partnumber = ?1 and am.manufacturer = m.manufacturer and m.state='ACTIVE'", nativeQuery = true)
    List<String> findAllMfrPNByPartNumber(String partNumber);
}
