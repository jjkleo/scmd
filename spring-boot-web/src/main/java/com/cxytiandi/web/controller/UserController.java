package com.cxytiandi.web.controller;

import com.cxytiandi.demo.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/user/name")
    public String getUserName(){
        return userClient.getName();
    }
}
