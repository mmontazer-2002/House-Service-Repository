package data.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Mahdie Montazeralzohoor on 1/11/2022 4:53 PM
 */
@Data
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private int rate;
    private String comment;
    @ManyToOne(cascade = CascadeType.ALL)
    private Order order;
}
