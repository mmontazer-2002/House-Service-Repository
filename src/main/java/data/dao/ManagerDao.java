package data.dao;
import data.entity.Manager;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.Optional;

/**
 * Created by Mahdie Montazeralzohoor on 1/24/2022 8:10 PM
 */
@Transactional
@Repository
public interface ManagerDao extends PagingAndSortingRepository<Manager, Integer> {
    Optional<Manager> findManagerByUsernameAndPassword(String username, String password);
}