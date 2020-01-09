package com.service.impl;

import com.dao.CustomerDao;
import com.dao.UserDao;
import com.po.Customer;
import com.po.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private CustomerDao customerDao;

    @Autowired
    HttpSession httpSession;

    @Override
    public int signUp(User user) {
        return userDao.signUp(user);
    }

    @Override
    public String signIn(User user) {

        String str = "";
        User u = userDao.signIn(user);
        if (u == null){
            return "login";
        }
        switch (u.getUserKind()) {
            case 0:
                str = "aInfo";//管理员登录
                break;
            case 1:
                Customer customer = customerDao.selectCusById(u.getUserId());
                str = "redirect:/loadingWater";//普通用户登录
//                str = "customer/cusInfo";
                this.httpSession.setAttribute("customer", customer);
                break;
            case 2:
                str = "sInfo";//分销商登录
                break;
            case 3:
                str = "redirect:/selectUnDone"; //配送员登录页面
                break;
            default:
                str = "login";
        }

        return str;
    }

}
