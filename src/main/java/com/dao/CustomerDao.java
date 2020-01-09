package com.dao;

import com.po.Customer;
import com.po.OrderRecord;
import com.po.Water;

import java.util.List;

public interface CustomerDao {
    //    修改普通用户信息
    public int changeInfo(Customer customer);
    //    根据cusId查询用户信息（查看用户信息）
    public Customer selectCusById (String cusId);
//    查询用户订单
    public List<OrderRecord> selectOrderById(String cusId);
    //    查看产品
    public List<Water> selectAllWater();
    //    下单
    public int orderWater (OrderRecord orderRecord);

}
