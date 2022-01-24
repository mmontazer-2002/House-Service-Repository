package data.dto;

import data.entities.enumration.UserStatus;
import lombok.*;

import java.util.Date;

/**
 * Created by Mahdie Montazeralzohoor on 1/24/2022 8:42 PM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class CustomerDTO {
    String username;
    String Email;
    long Credit;
    UserStatus userStatus;
    Date firstAccess;
}
