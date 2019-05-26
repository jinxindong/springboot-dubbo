package com.jin.learn.provider.springbootprovider.dao;

import org.springframework.stereotype.Repository;

/**
 * @author Karl Jin
 * @create 2019-05-25 22:11
 */
@Repository
public class UserDao {

    public String getNameById(Integer id) {
        if (id == 1) {
            return "jinxindong";
        }
        return "";
    }
}

