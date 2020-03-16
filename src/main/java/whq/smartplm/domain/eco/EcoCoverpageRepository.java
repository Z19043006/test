package whq.smartplm.domain.eco;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EcoCoverpageRepository extends JpaRepository<EcoCoverpageEntity,Long> {
    List<EcoCoverpageEntity> findByIssuerId(String issuerId);
}
