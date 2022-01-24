package data.dao;

import data.entities.Order;
import data.entities.enumration.OrderStatus;
import data.entities.SubService;
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
public interface OrderDao extends PagingAndSortingRepository<Order, Integer> {
    List<Order> findOrdersBySubService(SubService subService);

    @Override
    Optional<Order> findById(Integer integer);

    @Modifying
    @Query("update Order o set o.orderStatus=:waitingForChoosingExpert where o.id=:id")
    void updateOrderStatus(@Param("waitingForChoosingExpert") OrderStatus waitingForChoosingExpert, @Param("id") int id);
}
