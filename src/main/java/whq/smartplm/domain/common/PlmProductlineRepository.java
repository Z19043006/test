package whq.smartplm.domain.common;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface PlmProductlineRepository extends JpaRepository<PlmProductlineEntity, String> {
     PlmProductlineEntity findByProductcode(String productcode);

     PlmProductlineEntity findByProductdesc(String productdesc);

     @Query(value = "select productdesc from public.plm_productline" , nativeQuery = true)
     List<String> findAllProductdesc();
}
