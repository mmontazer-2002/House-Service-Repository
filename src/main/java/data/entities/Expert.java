package data.entities;

import data.entities.enumration.UserStatus;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Mahdie Montazeralzohoor on 1/11/2022 4:55 PM
 */
@Entity
@DiscriminatorValue(value = "expert")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true, of = {"image"})
@ToString(callSuper = true)
public class Expert extends User {
    @Enumerated(EnumType.STRING)
    private UserStatus userStatus;
    private Double score;
    /*@OneToMany(mappedBy = "expert")
    Set<ExpertSubService> expertSubServices;*/
    @Lob
    @Column(columnDefinition = "BLOB", length = 307200)
    private byte[] image;

    @Builder(setterPrefix = "with")
    public Expert(int id, String username, String password, String email, Date firstAccess, Date lastUpdate, UserStatus userStatus, Double score, byte[] image) {
        super(id, username, password, email, firstAccess, lastUpdate);
        this.userStatus = userStatus;
        this.score = score;
        this.image = image;
    }
}
