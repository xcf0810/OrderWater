package com.service;

import com.po.OrderRecord;
import org.springframework.ui.Model;

import java.util.List;

public interface EmployeeService {
    //    查询待配送订单
    public List<OrderRecord> selectUnDone();
    //    查询已配送订单
    public List<OrderRecord> selectDone();
    //    修改订单状态
    public int changeStatus(Integer[] orderId);
}
