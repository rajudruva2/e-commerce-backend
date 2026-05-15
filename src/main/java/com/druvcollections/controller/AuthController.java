package com.druvcollections.controller;

import com.druvcollections.model.User;
import com.druvcollections.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User loginUser) {

        User user = userRepository
                .findByUsername(loginUser.getUsername());

        if (user != null &&
                user.getPassword().equals(loginUser.getPassword())) {

            return ResponseEntity.ok(user);
        }

        return ResponseEntity.status(401)
                .body("Invalid Credentials");
    }
}
