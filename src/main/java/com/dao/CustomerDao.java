package com.dao;

import com.po.Customer;

public interface CustomerDao {
    //    修改普通用户信息
    public Customer changeInfo(Customer customer);
    //    根据cusId查询用户信息（查看用户信息）
    public Customer selectCusById (String cusId);

}
