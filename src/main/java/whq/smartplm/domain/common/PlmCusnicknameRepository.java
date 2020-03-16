package whq.smartplm.domain.common;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlmCusnicknameRepository extends JpaRepository<PlmCusnicknameEntity, String> {
    @Query(value = "select nickname from public.plm_cusnickname" , nativeQuery = true)
    List<String> findAllNickname();

    @Query(value = "select nickname from public.plm_cusnickname where customername=?1" , nativeQuery = true)
    List<String> findNickNameByCustomerName(String customerName);
}
