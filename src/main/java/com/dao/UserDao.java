package com.dao;

import com.po.User;

public interface UserDao {
//    注册
    public int signUp(User user);
//    登录
    public User signIn(User user);
}
