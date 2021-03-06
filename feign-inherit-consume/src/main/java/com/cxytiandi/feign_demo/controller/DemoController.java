package com.cxytiandi.feign_demo.controller;

import com.cxytiandi.feignapi.user.User;
import com.cxytiandi.feignapi.user.UserRemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {

    @Autowired
    private UserRemoteClient userRemoteClient;

    @GetMapping("/call")
    public String callHello(){
        String result= userRemoteClient.getName();
        System.out.println("getName调用结果："+result);

        result = userRemoteClient.getUserInfo("zhangzimu");
        System.out.println("getUserInfo调用结果：" + result);

        Map<String, Object> param = new HashMap<String, Object>();
        param.put("name", "wuqimeng");
        result = userRemoteClient.getUserDetail(param);
        System.out.println("getUserDetail调用结果：" + result);

        User user = new User();
        user.setName("peijiaxin");
        result = userRemoteClient.addUser(user);
        System.out.println("addUser调用结果：" + result);
        return result;
    }
}
