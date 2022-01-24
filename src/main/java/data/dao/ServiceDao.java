package data.dao;

import data.entities.Service;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Created by Mahdie Montazeralzohoor on 1/24/2022 8:09 PM
 */
@Transactional
@Repository
public interface ServiceDao extends PagingAndSortingRepository<Service, Integer> {

    Optional<Service> findMainServiceByField(String field);
}
