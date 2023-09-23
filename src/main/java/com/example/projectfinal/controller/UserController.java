package com.example.projectfinal.controller;

import com.example.projectfinal.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/join")
    public ResponseEntity<Object> join(){
        return ResponseEntity.ok().body(1);
    }

    @PostMapping("/login")
    public ResponseEntity<Object> login(){
        return ResponseEntity.ok().body(1);
    }
}
