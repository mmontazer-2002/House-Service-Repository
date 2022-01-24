package data.dao;
import data.entities.Service;
import data.entities.SubService;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Created by Mahdie Montazeralzohoor on 1/24/2022 8:09 PM
 */
@Transactional
@Repository
public interface SubServiceDao extends PagingAndSortingRepository<SubService, Integer> {

    Optional<SubService> findBySubServiceDescriptionAndBasePriceAndMainService(String subServiceDescription, long BasePrice, Service Service);

    Optional<SubService> findBySubServiceDescription(String subServiceDescription);

    Optional<SubService> findSubServiceBySubServiceDescription(String subServiceDescription);
}
