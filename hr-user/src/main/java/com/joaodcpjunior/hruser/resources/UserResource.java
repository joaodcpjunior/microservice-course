package com.joaodcpjunior.hruser.resources;

import com.joaodcpjunior.hruser.entities.User;
import com.joaodcpjunior.hruser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/{id}")
    private ResponseEntity<User> findById(@PathVariable Long id) {
        User obj = userRepository.findById(id).get();
        return ResponseEntity.ok(obj);
    }

    @GetMapping(value = "/search")
    private ResponseEntity<User> findByEmail(@RequestParam String email) {
        User obj = userRepository.findByEmail(email);
        return ResponseEntity.ok(obj);
    }
}
