package com.cxytiandi.web;

import com.cxytiandi.demo.EnableUserClient;
import com.cxytiandi.web.base.StartCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableUserClient
@SpringBootApplication
public class SpringBootWebApplication {


    public static void main(String[] args) {
//        new StartCommand(args);
        SpringApplication.run(SpringBootWebApplication.class, args);
    }

}
