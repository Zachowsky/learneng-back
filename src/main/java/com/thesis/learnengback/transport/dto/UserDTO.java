package com.thesis.learnengback.transport.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserDTO {
    private String name;
    private String surname;
    private String email;
    private String password;

}
