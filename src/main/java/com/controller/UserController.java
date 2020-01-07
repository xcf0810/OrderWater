package com.controller;

import com.po.Customer;
import com.po.User;
import com.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

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
    @RequestMapping("/toSignIn")
    public String toSignIn(){
    return "login";
}
    @RequestMapping("/signIn")
    public String signIn(User user,Model model){
        return this.userService.signIn(user);
    }
}
