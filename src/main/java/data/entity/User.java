package data.entity;

import data.entity.enumration.UserStatus;
import data.entity.enumration.Role;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Mahdie Montazeralzohoor on 1/10/2022 6:45 PM
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "role", discriminatorType = DiscriminatorType.STRING)
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"username, password"})
@ToString
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int userId;
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false, unique = true)
    private String email;
    @CreationTimestamp
    private Date firstAccess;
    @UpdateTimestamp
    private Date lastUpdate;
}

