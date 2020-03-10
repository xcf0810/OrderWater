package com.controller;

import com.po.User;
import com.service.AdminstratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AdministratorController {

    @Autowired
    private  AdminstratorService adminstratorService;
    @Autowired
    HttpSession session;


    @RequestMapping("/addUser")
    public String addUser(User user, Model model){
        this.adminstratorService.addUser(user);
        return "forward:/listUsers";
    }
    @RequestMapping("/listUsers")
    public String listUsers(Model model){
        User user = (User)session.getAttribute("user");
        if (user.getUserKind() != 0){
            return "errors/404";
        }else {
            List<User> list= this.adminstratorService.listUsers();
            model.addAttribute("userLists",list);
            return "/admin/userList";
        }
    }
    //        重置密码
    @PostMapping("/resetUsers")
    public String resetUsers(Integer[] userId){
        System.out.println("fghnucrtvbncrftv");
        session.setAttribute("user",session.getAttribute("user"));
        this.adminstratorService.resetUsers(userId);
        return "forward:/listUsers";
    }
    @RequestMapping("/toAddUsers")
    public String toAddUsers(Model model){
        User user = (User)session.getAttribute("user");
        if (user.getUserKind() != 0){
            return "errors/404";
        }else {
            return "/admin/addUser";
        }
    }
}
