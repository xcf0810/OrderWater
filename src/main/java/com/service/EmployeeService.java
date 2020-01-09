package com.service;

import com.po.OrderRecord;
import org.springframework.ui.Model;

import java.util.List;

public interface EmployeeService {
    //    查询待配送订单
    public List<OrderRecord> selectUnDone();
}
