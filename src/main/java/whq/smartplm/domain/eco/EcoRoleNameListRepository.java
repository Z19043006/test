package whq.smartplm.domain.eco;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EcoRoleNameListRepository extends JpaRepository<EcoRoleNameListEntity,Long> {
    List<EcoRoleNameListEntity> findByPlant(String plant);
}
