package data.dto;

import data.entities.enumration.UserStatus;

import java.util.Date;

/**
 * Created by Mahdie Montazeralzohoor on 1/24/2022 8:42 PM
 */
public class ManagerDto {
    String username;
    String email;
    double score;
    UserStatus userStatus;
    Date firstAccess;
}
