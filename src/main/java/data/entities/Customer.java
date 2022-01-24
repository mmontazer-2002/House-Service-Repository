package data.entities;


import data.entities.enumration.UserStatus;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by Mahdie Montazeralzohoor on 1/11/2022 4:55 PM
 */

@Entity
@DiscriminatorValue(value = "customer")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true, of = {"userStatus"})
@ToString(callSuper = true)
public class Customer extends User {
    @Enumerated(EnumType.STRING)
    private UserStatus userStatus;
    private long credit;
    @OneToMany(mappedBy = "customer")
    private Set<Address> customerAddressSet;

    @Builder(setterPrefix = "with")
    public Customer(int id, String username, String password, String email, Date firstAccess, Date lastUpdate, UserStatus userStatus, long credit) {
        super(id, username, password, email, firstAccess, lastUpdate);
        this.userStatus = userStatus;
        this.credit = credit;
    }
}
