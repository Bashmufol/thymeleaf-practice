package com.bash.thymeleaftutorial.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class UserForm {
    private String name;
    private String email;
    private String password;
    private String gender;
    private String address;
    private Boolean married;
    private String profession;
}
