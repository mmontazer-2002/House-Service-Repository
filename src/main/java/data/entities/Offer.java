package data.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Mahdie Montazeralzohoor on 1/11/2022 4:59 PM
 */
@Setter
@Getter
@Entity
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date offerSubmissionDate;
    private double proposedPrice;
    private String workDuration;
    private Date startTime;
    @ManyToMany(cascade = CascadeType.ALL)
    private Order order;
}
