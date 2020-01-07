package com.service;

import com.po.User;

import java.util.Map;

public interface UserService {
//    注册
    public int signUp(User user);
//    登录
    public String signIn(User user);
}
