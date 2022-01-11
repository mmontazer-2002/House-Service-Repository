package data.entity;

import data.entity.enumration.CustomerStatus;
import data.entity.enumration.Role;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Mahdie Montazeralzohoor on 1/10/2022 6:45 PM
 */
@Setter
@Getter
@MappedSuperclass
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false, length = 8)
    private String password;
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date registrationDate;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private CustomerStatus clientStatus;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;
}
