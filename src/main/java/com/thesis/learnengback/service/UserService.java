package com.thesis.learnengback.service;

import com.thesis.learnengback.config.CustomException;
import com.thesis.learnengback.database.entity.User;
import com.thesis.learnengback.database.repository.UserRepository;
import com.thesis.learnengback.transport.converter.UserConv;
import com.thesis.learnengback.transport.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> findByEmail(String email){
        return userRepository.findByEmail(email);
    }

    public User login(String email, String password){
        return findByEmail(email).map(e -> {
            if(!password.matches(e.getPassword())){
                throw new CustomException("WRONG PASSWORD");
            }
            return e;
        }).orElseThrow(()-> new CustomException("WRONG EMAIL"));
    }

    public User loginGoogleUser(User user) {

        Optional<User> userOptional = findByEmail(user.getEmail());

        if (userOptional.isEmpty()) {
            User save = userRepository.save(user);
            return save;
        }
        return userOptional.get();
    }

    public boolean register(UserDTO userDTO){
        Optional<User> searchUserByEmail = findByEmail(userDTO.getEmail());

        if(searchUserByEmail.isPresent()){
            throw new CustomException("USER ALREADY EXISTS");
        }
        User convertedUser = UserConv.convToEntity(userDTO);
        userRepository.save(convertedUser);
        return true;

    }
}
