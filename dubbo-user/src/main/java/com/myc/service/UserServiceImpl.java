package com.myc.service;

import com.myc.api.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public String getUser(String name) {
        return name;
    }
}
