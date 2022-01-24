package data.dao;

import data.entities.ExpertSubService;
import data.entities.SubService;
import data.entities.Expert;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Created by Mahdie Montazeralzohoor on 1/24/2022 8:11 PM
 */
@Transactional
@Repository
public interface ExpertSubServiceDao extends CrudRepository<ExpertSubService, Integer> {

    Optional<ExpertSubService> findExpertSubServiceByExpertAndSubService(Expert expert, SubService subService);

    @Query("from ExpertSubService exsub join exsub.subService sub where sub.subServiceDescription=:subServiceDescription")
    List<ExpertSubService> findExpertSubServiceBySubServiceDescription(@Param("subServiceDescription") String subServiceDescription);

    List<ExpertSubService> findExpertSubServiceBySubService(SubService subService);

    @Modifying
    void deleteByExpertAndSubService(Expert expert, SubService subService);

    List<ExpertSubService> findExpertSubServicesBySubService(SubService subService);
}