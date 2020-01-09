package com.dao;

import com.po.OrderRecord;

import java.util.List;

public interface EmployeeDao {
//    查询待配送订单
    public List<OrderRecord> selectUnDone();
//    查询已配送订单
//    修改订单状态
}
