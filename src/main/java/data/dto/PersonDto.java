package data.dto;

import data.entity.enumration.CustomerStatus;
import data.entity.enumration.Role;

import java.util.Date;

/**
 * Created by Mahdie Montazeralzohoor on 1/12/2022 1:10 AM
 */
public class PersonDto {
    private String name;
    private String lastName;
    private String email;
    private Date registrationDate;
    private CustomerStatus clientStatus;
    private Role role;
}