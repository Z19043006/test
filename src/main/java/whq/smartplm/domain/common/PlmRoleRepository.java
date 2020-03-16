package whq.smartplm.domain.common;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlmRoleRepository extends JpaRepository<PlmRoleEntity, String> {

}
