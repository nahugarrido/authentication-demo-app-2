package com.example.authenticationdemo2.security.controller;

import com.example.authenticationdemo2.security.entity.User;
import com.example.authenticationdemo2.security.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/saveUser")
    public String saveUser(@RequestBody User user) {
        Integer id = userService.saveUser(user);
        return "User with id " + id + " saved";
    }

}