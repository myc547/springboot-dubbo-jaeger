package com.myc.service;

import com.myc.api.GreetingService;
import com.myc.api.UserService;

import java.util.Random;

public class GreetingServiceImpl implements GreetingService {

    private UserService userService;

    @Override
    public String say(String name) {
        try {
            // 通过 sleep 模拟业务逻辑处理时间
            Thread.sleep(new Random(System.currentTimeMillis()).nextInt(1000));
        } catch (InterruptedException e) {
        }
        return "greeting, " + userService.getUser(name);
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
