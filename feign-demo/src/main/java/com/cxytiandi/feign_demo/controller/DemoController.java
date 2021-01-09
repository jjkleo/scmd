package com.cxytiandi.feign_demo.controller;

import com.cxytiandi.feign_demo.remote.UserRemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private UserRemoteClient userRemoteClient;

    @GetMapping("/callHello")
    public String callHello() {
        String result= userRemoteClient.hello();
        System.out.println("调用结果："+result);
        return result;
    }

}
