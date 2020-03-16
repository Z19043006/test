package whq.smartplm.domain.eco;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;

@Repository
public interface EcoCommentRepository extends JpaRepository<EcoCommentEntity,Long> {
    List<String> findByEcrNoIn (List<String> ecrNo);

}
