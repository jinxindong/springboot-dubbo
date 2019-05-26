package com.jin.learn.provider.springbootprovider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jin.learn.api.springbootapi.api.UserService;
import com.jin.learn.provider.springbootprovider.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Karl Jin
 * @create 2019-05-25 22:10
 */
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public String getNameById(Integer id) {
        return userDao.getNameById(id);
    }
}
