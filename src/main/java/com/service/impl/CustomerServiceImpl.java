package com.service.impl;

import com.dao.CustomerDao;
import com.po.Customer;
import com.po.OrderRecord;
import com.po.Water;
import com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Override
    public Customer changeInfo(Customer customer) {
//        修改
        this.customerDao.changeInfo(customer);
//        获取最新
        Customer cus = this.customerDao.selectCusById(customer.getCusId());
        return cus;
    }

    @Override
    public Customer selectCusById(String cusId) {
        return this.customerDao.selectCusById(cusId);
    }

    @Override
    public List<OrderRecord> selectOrderById(String cusId) {
        return this.customerDao.selectOrderById(cusId);
    }

    @Override
    public List<Water> selectAllWater() {
        return this.customerDao.selectAllWater();
    }

    @Override
    public int orderWater(OrderRecord orderRecord) {
        return this.customerDao.orderWater(orderRecord);
    }
}
