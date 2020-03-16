package whq.smartplm.domain.eco;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EcoCosignerRepository extends JpaRepository<EcoCosignerEntity,Long> {

}
