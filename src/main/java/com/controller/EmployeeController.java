package com.controller;

import com.po.OrderRecord;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    //    查询待配送订单
    @RequestMapping("/selectUnDone")
    public String selectUnDone(Model model){
        List<OrderRecord> list = this.employeeService.selectUnDone();
        model.addAttribute("UnDoneList",list);
        System.out.println(list);
        return "employee/UnDoneOrder";
    }
    @RequestMapping("/selectDone")
    public String selectDone(Model model){
        List<OrderRecord> list = this.employeeService.selectUnDone();
        model.addAttribute("DoneList",list);
        return "employee/DoneOrder";
    }
}
