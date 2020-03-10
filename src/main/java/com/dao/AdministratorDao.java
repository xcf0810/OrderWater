package com.dao;

import com.po.User;

import java.util.List;

public interface AdministratorDao {
//    添加账号
    public int addUser(User user);
//    查询用户列表
    public List<User> listUsers();
//    重置密码
    public int resetUsers(Integer[] userId);
}
