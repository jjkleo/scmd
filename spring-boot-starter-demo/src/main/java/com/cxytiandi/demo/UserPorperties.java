package com.cxytiandi.demo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("spring.user")
public class UserPorperties {

    private String name;
}
