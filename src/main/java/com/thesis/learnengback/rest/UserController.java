package com.thesis.learnengback.rest;

import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.gson.GsonFactory;
import com.thesis.learnengback.config.GoogleIdTokenVerifier;
import com.thesis.learnengback.database.entity.User;
import com.thesis.learnengback.service.UserService;
import com.thesis.learnengback.transport.converter.UserConv;
import com.thesis.learnengback.transport.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.NoSuchElementException;

@RestController
@RequiredArgsConstructor
public class UserController {


    @Value("${spring.security.oauth2.client.registration.google.client-id}")
    private String googleClientId;

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

        userService.register(userDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping(value ="/dashboard/password")
    public ResponseEntity<?> changePassword(@RequestBody UserDTO userDTO){

        userService.changePassword(userDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/google/{idToken}")
    public ResponseEntity<UserDTO> loginGoogleUser(HttpServletRequest request, @PathVariable String idToken) throws GeneralSecurityException, IOException {
        GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(new NetHttpTransport(), new GsonFactory())
                .setAudience(Collections.singletonList(googleClientId))
                .build();
        GoogleIdToken idTokenDecrypt = verifier.verify(idToken);
        User user = null;
        if (idTokenDecrypt != null) {
            GoogleIdToken.Payload payload = idTokenDecrypt.getPayload();
            String email = payload.getEmail();
            String familyName = (String) payload.get("family_name");
            String givenName = (String) payload.get("given_name");
            user = User.builder().email(email).name(givenName).surname(familyName).build();
        }
        if (user != null) {
            User user1 = userService.loginGoogleUser(user);
            return ResponseEntity.ok(UserConv.convToDTO(user1));
        }
        return ResponseEntity.badRequest().build();
    }
}
