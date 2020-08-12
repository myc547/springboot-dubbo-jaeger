package com.myc.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.myc.api.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference(check = false)
    private UserService userService;

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return "hello," + userService.getUser(name);
    }
}
