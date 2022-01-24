package data.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mahdie Montazeralzohoor on 1/10/2022 6:24 PM
 */
public class SubService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private double basePrice;
    private String description;
    @ManyToMany(mappedBy = "subServices")
    private List<Expert> expertList = new ArrayList<>();

}