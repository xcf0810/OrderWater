package com.service.impl;

import com.dao.CustomerDao;
import com.po.Customer;
import com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
