package data.entities;

import data.entities.enumration.OrderStatus;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Mahdie Montazeralzohoor on 1/11/2022 4:59 PM
 */
@Setter
@Getter
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double proposedPrice;
    @Lob
    private String description;
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date orderPlacingDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date proposedDateToDo;
    @OneToOne
    private Address address;
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Offer> offers = new ArrayList<>();

}
