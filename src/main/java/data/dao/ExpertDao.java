package data.dao;

import data.entities.enumration.UserStatus;
import data.entities.Expert;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Created by Mahdie Montazeralzohoor on 1/24/2022 8:10 PM
 */
@Transactional
@Repository
public interface ExpertDao extends PagingAndSortingRepository<Expert, Integer> {
    Optional<Expert> findExpertByUsernameAndPassword(String username, String password);

    @Modifying
    @Query("update Expert e set e.password=:newPassword where e.username=:username and e.password=:password")
    void updateExpertPassword(@Param("username") String username, @Param("password") String password, @Param("newPassword") String newPassword);

    List<Expert> getAllByUserStatus(UserStatus userStatus);

    @Modifying
    @Query("update Expert e set e.userStatus=:newUserStatus where e.username=:username and e.password=:password")
    void updateExpertStatus(@Param("username") String username, @Param("password") String password, @Param("newUserStatus") UserStatus newUserStatus);

    Optional<Expert> findExpertByUsernameAndUserStatus(String username, UserStatus userStatus);
}
