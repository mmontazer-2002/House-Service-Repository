package data.dao;

import data.entity.Address;
import data.entity.CustomerAddress;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Mahdie Montazeralzohoor on 1/24/2022 8:11 PM
 */
@Transactional
@Repository
public interface CustomerAddressDao extends PagingAndSortingRepository<CustomerAddress, Integer> {
    List<CustomerAddress> findCustomerAddressByAddress(Address address);
}
