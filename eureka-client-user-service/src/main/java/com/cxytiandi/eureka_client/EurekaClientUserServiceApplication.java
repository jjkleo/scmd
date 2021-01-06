package com.cxytiandi.eureka_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClientUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientUserServiceApplication.class, args);
    }

}
