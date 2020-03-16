package whq.smartplm.domain.common;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BasAccountRpository extends JpaRepository<BasAccountEntity, Long> {
    List<BasAccountEntity> findByEmployeeNo(String employeeNo);
    List<BasAccountEntity> findByEmployeeNoLike(String employeeNo);
    List<BasAccountEntity> findByEmployeeNoIn(List<String> employeeNoList);
    BasAccountEntity findOneByEmployeeNo(String employeeNo);
    BasAccountEntity findOneByEnglishName(String englishName);
}

