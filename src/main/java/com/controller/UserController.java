package com.controller;

import com.po.User;
import com.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

//注册
    @RequestMapping("/toSignUp")
    public String toSignUp(){
        return "signUp";
    }

    @RequestMapping("/signUp")
    public String signUp(User user){
        this.userService.signUp(user);
        return "login";
    }
//登录
    @RequestMapping("/signIn")
    public String signIn(User user){
        return this.userService.signIn(user);
    }
}
