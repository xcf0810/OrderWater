package com.service.impl;

import com.dao.AdministratorDao;
import com.po.User;
import com.service.AdminstratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class AdministratorServiceImpl implements AdminstratorService {
    @Autowired
    AdministratorDao administratorDao;

    //    添加账号
    @Override
    public int addUser(User user){
        return  this.administratorDao.addUser(user);
    }

    @Override
    public List<User>  listUsers() {
        return  this.administratorDao.listUsers();
    }

    @Override
    public int resetUsers(Integer[] userId) {
        return this.administratorDao.resetUsers(userId);
    }
}
