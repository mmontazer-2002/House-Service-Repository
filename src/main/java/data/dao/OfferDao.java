package data.dao;

import data.entity.Offer;
import data.entity.Order;
import data.entity.Expert;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.Optional;

/**
 * Created by Mahdie Montazeralzohoor on 1/24/2022 8:10 PM
 */
@Transactional
@Repository
public interface OfferDao extends PagingAndSortingRepository<Offer, Integer> {
    Optional<Offer> findOfferByExpertAndOrder(Expert expert, Order order);
}
