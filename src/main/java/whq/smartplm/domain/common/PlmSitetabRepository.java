package whq.smartplm.domain.common;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlmSitetabRepository extends JpaRepository<PlmSitetabEntity, String> {

    @Query(value = "select uccsitename from public.plm_sitetab where uccsitename in ?1" , nativeQuery = true)
    List<String> findUccsitenameByPlanList(List<String> plantList);

    List<PlmSitetabEntity> findByUccsitenameIn(List<String> plantList);
}
