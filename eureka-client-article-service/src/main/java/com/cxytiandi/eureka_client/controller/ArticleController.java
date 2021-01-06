package com.cxytiandi.eureka_client.controller;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ArticleController {

    @Autowired
    private RestTemplate restTemplate;

    @Qualifier("eurekaClient")
    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/article/infos")
    private Object serviceUrl(){
        return eurekaClient.getInstancesByVipAddress("eureka-client-user-service", false);
//        return discoveryClient.getInstances("eureka-client-user-service");
    }

    //@LoadBalanced时不写服务名的调用会报错
    @GetMapping("/article/callHello")
    public String callHello() {
        return restTemplate.getForObject("http://localhost:8083/user/hello", String.class);
    }

    @GetMapping("/article/callHello2")
    public String callHello2() {
        return restTemplate.getForObject("http://eureka-client-user-service/user/hello", String.class);
    }
}
