package data.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Mahdie Montazeralzohoor on 1/11/2022 4:55 PM
 */
@Data
@Entity
public class Admin extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Lob
    @Column(unique = true, columnDefinition = "BLOB", length = 3072)
    private byte[] imageData;
    private int rate;

}
