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
    private int rate;//todo
    private String comment;
    /*@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(updatable = false, nullable = false, foreignKey = @ForeignKey(name = "COMMENT_EXPERT_FK"))
    private Expert expert;*/
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    //@JoinColumn(name = "order_id", updatable = false, nullable = false, foreignKey = @ForeignKey(name = "COMMENT_ORDER_FK"))
    private Order order;
}
