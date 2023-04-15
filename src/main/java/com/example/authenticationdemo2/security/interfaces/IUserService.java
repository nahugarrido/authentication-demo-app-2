package com.example.authenticationdemo2.security.interfaces;

import com.example.authenticationdemo2.security.entity.User;

import java.util.List;


public interface IUserService {

    // Save user and returns the user id
    public Integer saveUser(User user);

}
