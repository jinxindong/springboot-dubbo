package com.jin.learn.consumer.springbootconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jin.learn.api.springbootapi.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Karl Jin
 * @create 2019-05-25 23:41
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping(value = "/user/{id}")
    public String sayHello(@PathVariable Integer id) {
        System.out.println("----------------------------------------");
        System.out.println("===" + id);
        System.out.println("----------------------------------------");
        String s = userService.getNameById(id);
        return s;

    }
}
