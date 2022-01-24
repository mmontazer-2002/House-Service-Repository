package data.dao;

import data.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Created by Mahdie Montazeralzohoor on 1/24/2022 8:09 PM
 */
@Transactional
@Repository
public interface UserDao extends PagingAndSortingRepository<User, Integer> {
    Optional<User> findUserByEmail(String email);

    Optional<User> findUserByUsername(String username);

    Optional<User> findUserByUsernameAndPassword(String username, String password);
}

