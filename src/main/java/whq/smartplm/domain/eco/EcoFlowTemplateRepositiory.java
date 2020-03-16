package whq.smartplm.domain.eco;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EcoFlowTemplateRepositiory  extends JpaRepository<EcoFlowTemplateEntity,Long> {
    //find by plant
    List<EcoFlowTemplateEntity> findByPlant(String plant);

    //find by plant and role
    List<EcoFlowTemplateEntity> findByPlantAndRole(String plant,String role);

    //get all distinct role
    @Query(value = "select distinct role from ccm.eco_flow_template",nativeQuery = true)
    List<String> getRole();
}
