package by.kovalski.packagemanagement.model;

import lombok.Data;

@Data
public class User {
    private long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;
}
