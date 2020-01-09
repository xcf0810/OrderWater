package com.controller;

import com.po.Customer;
import com.po.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    HttpSession session;

    //注册
    @RequestMapping("/toSignUp")
    public String toSignUp() {
        return "signUp";
    }

    @RequestMapping("/signUp")
    public String signUp(User user) {
        this.userService.signUp(user);
        return "login";
    }

    //登录
    @RequestMapping("/toSignIn")
    public String toSignIn() {
        return "login";
    }

    @RequestMapping("/signIn")
    public String signIn(User user) {
//        HttpSession session = null;
//        session.setAttribute("userId",user.getUserId());
        String str = this.userService.signIn(user);
//        System.out.println(session.getAttribute("customer"));
        return str;
    }
}
