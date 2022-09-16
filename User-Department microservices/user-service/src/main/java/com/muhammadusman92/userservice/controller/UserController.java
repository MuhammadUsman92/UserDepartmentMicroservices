package com.muhammadusman92.userservice.controller;

import com.muhammadusman92.userservice.dto.ResponseDto;
import com.muhammadusman92.userservice.entities.User;
import com.muhammadusman92.userservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }
    @GetMapping("/{userId}")
    public ResponseDto getUserWithDepartment(@PathVariable Long userId){
        return userService.getUserWithDepartment(userId);
    }
}
