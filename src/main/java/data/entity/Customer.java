package data.entity;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mahdie Montazeralzohoor on 1/11/2022 4:55 PM
 */
@Data
@Entity
public class Customer {
    @OneToMany(cascade = CascadeType.ALL)
    private List<Order> orders = new ArrayList<>();
    @OneToOne(cascade = CascadeType.ALL)
    private Wallet wallet;
}
