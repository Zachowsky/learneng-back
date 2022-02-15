package com.thesis.learnengback.service;

import com.thesis.learnengback.database.entity.User;
import com.thesis.learnengback.database.repository.UserRepository;
import com.thesis.learnengback.transport.converter.UserConv;
import com.thesis.learnengback.transport.dto.UserDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.mockito.Mockito.verify;


@SpringBootTest
public class UserServiceTests {


     private UserService userService;
     private UserRepository userRepository;

    @BeforeEach
    void setUp(){
        this.userRepository = Mockito.mock(UserRepository.class);
        this.userService = new UserService(userRepository);
    }

    @Test
    void shouldRegisterNewUserAccount() {
        User user = new User(null, "Pawel", "Zacharz", "mail@mail.pl", "12345");
        Mockito.when(userRepository.findByEmail(user.getEmail())).thenReturn(Optional.empty());

        UserDTO userDTO = UserConv.convToDTO(user);
        userService.register(userDTO);

        verify(userRepository, Mockito.times(1)).save(Mockito.eq(user));
    }
    @Test
    void shouldFindUserByEmail(){
        User user = new User(null, "Pawel", "Zacharz", "mail@mail.pl", "12345");

        Mockito.when(userRepository.findByEmail(user.getEmail())).thenReturn(Optional.empty());

        userService.findByEmail(user.getEmail());

        verify(userRepository, Mockito.times(1)).findByEmail(Mockito.eq(user.getEmail()));

    }

}

