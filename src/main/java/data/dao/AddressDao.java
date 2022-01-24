package data.dao;

import data.entities.Address;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Created by Mahdie Montazeralzohoor on 1/24/2022 8:11 PM
 */
@Transactional
@Repository
public interface AddressDao extends PagingAndSortingRepository<Address, Integer> {
    Optional<Address> findAddressByPostalCode(String postalCode);
}
