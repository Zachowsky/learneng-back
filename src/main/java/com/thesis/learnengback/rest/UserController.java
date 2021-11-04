package com.thesis.learnengback.rest;

import com.thesis.learnengback.database.entity.User;
import com.thesis.learnengback.service.UserService;
import com.thesis.learnengback.transport.converter.UserConv;
import com.thesis.learnengback.transport.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.realm.UserDatabaseRealm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.NoSuchElementException;

@RestController
@RequiredArgsConstructor
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }


    @PostMapping(value = "/login")
    public ResponseEntity<UserDTO> loginUser(@RequestBody UserDTO userDTO){

        try{
            User user = userService.login(userDTO.getEmail(), userDTO.getPassword());
            return ResponseEntity.ok(UserConv.convToDTO(user));
        }catch(NoSuchElementException e){
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping(value = "/register")
    public ResponseEntity<UserDTO> registerUser(@RequestBody UserDTO userDTO){
        boolean user = userService.register(userDTO);
        if(user){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
