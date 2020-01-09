package com.controller;

import com.po.Customer;
import com.po.OrderRecord;
import com.po.Water;
import com.service.CustomerService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @Autowired
    HttpSession httpSession;

//    回主页
    @RequestMapping("/toHome")
    public String toHome(){
        return "customer/cusInfo";
    }
    //修改用户信息
    @RequestMapping("/toChangeCusInfo")
    public String toChangeCusInfo() {
        return "customer/changeInfo";
    }

    @RequestMapping("/changeCusInfo")
    public String changeInfo(Customer customer) {
//        从session里面获取用户id
        customer.setCusId(((Customer) httpSession.getAttribute("customer")).getCusId());

        customer = this.customerService.changeInfo(customer);
        httpSession.setAttribute("customer", customer);
        return "customer/cusInfo";
    }

    //    查看用户信息


    //    查询用户订单

    @RequestMapping("/selectAllOrder")
    public String selectOrderById(String cusId,Model model) {
//        从session获取id
        if (cusId == null){
            cusId =((Customer) httpSession.getAttribute("customer")).getCusId();
        }
        List<OrderRecord> list = this.customerService.selectOrderById(cusId);
        model.addAttribute("orderList",list);
System.out.println(list);
        return "customer/cusOrder";
    }

    @RequestMapping("/loadingWater")
    public String loadingWater(Model model){
        List<Water> list = this.customerService.selectAllWater();
        model.addAttribute("WaterList",list);
//        System.out.println(list);
        return "customer/cusIndex";
    }

    @RequestMapping("/orderWater")
    public String orderWater(OrderRecord orderRecord){
//        从session中获取用户id并装入
        orderRecord.setCusId(((Customer)httpSession.getAttribute("customer")).getCusId());
        this.customerService.orderWater(orderRecord);
        return "redirect:/selectAllOrder";
    }



}
