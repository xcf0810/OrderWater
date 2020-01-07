package com.service;

import com.dao.UserDao;
import com.po.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public int signUp(User user) {
        return  userDao.signUp(user);
    }

    @Override
    public String signIn(User user) {
        String str = null;
        User u = userDao.signIn(user);
        switch (u.getUserKind()){
            case 0:
                str = "aIndex";//管理员登录
                break;
            case 1:
                str = "cusIndex";//普通用户登录
                break;
            case 2:
                str = "sIndex";//分销商登录
                break;
            case 3:
                str = "eIndex"; //配送员登录页面
                break;
        }
        return str;
    }

}
