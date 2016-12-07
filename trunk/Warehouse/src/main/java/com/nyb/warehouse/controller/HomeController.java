package com.nyb.warehouse.controller;

import com.nyb.warehouse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by aa on 2016/12/6.
 */
@RestController
@RequestMapping
public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping("helloworld")
    public String helloWorld(){

        return  "hello world";
    }
}
