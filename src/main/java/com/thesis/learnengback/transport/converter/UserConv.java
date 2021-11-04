package com.thesis.learnengback.transport.converter;

import com.thesis.learnengback.database.entity.User;
import com.thesis.learnengback.transport.dto.UserDTO;

public class UserConv {

    public static User convToEntity(UserDTO userdto) {
        return new User(userdto.getName(), userdto.getSurname(), userdto.getEmail(), userdto.getPassword());
    }

    public static UserDTO convToDTO(User user){
        return new UserDTO(user.getName(), user.getSurname(), user.getEmail(),user.getPassword());
    }
}
