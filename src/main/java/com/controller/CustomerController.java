package com.controller;

import com.po.Customer;
import com.service.CustomerService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;
//修改用户信息
    @RequestMapping("/changeCusInfo")
    public String changeInfo(Customer customer, Model model){
        Customer cus = this.customerService.changeInfo(customer);
        model.addAttribute("customer",cus);
        return "cusInfo";
    }

}
