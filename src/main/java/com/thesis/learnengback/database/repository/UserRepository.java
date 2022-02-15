package com.thesis.learnengback.database.repository;

import com.thesis.learnengback.database.entity.User;
import com.thesis.learnengback.transport.dto.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);
}

