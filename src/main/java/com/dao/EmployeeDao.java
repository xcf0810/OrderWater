package com.dao;

import com.po.OrderRecord;

import java.util.List;

public interface EmployeeDao {
//    查询待配送订单
    public List<OrderRecord> selectUnDone();
//    查询已配送订单
    public List<OrderRecord> selectDone();
//    修改订单状态
    public int changeStatus(Integer[] orderId);
}
