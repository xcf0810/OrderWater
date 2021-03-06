package com.service.impl;

import com.dao.EmployeeDao;
import com.po.OrderRecord;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeDao employeeDao;

    @Override
    public List<OrderRecord> selectUnDone() {
        return this.employeeDao.selectUnDone();
    }

    @Override
    public List<OrderRecord> selectDone() {
        return this.employeeDao.selectDone();
    }

    @Override
    public int changeStatus(Integer[] orderId) {
        return this.employeeDao.changeStatus(orderId);
    }
}
