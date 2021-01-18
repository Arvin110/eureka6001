package com.arvin.controller;

import com.arvin.client.UsersClient;
import com.arvin.pojo.CommonResult;
import com.arvin.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author Arvin
 * @date 2021/1/12
 **/
@RestController
public class UsersController {
    @Autowired
    private UsersClient usersClient;

    @PostMapping("/login.action")
    public CommonResult login(Users users){
        System.out.println("消费者："+users);
        return usersClient.login(users);
    }

    @RequestMapping("/add.action")
    public CommonResult add(Users users){
        System.out.println("map:"+users);
        return usersClient.add(users);
    }

}
