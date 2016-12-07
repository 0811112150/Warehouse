package com.nyb.warehouse.controller;

import com.nyb.warehouse.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by aa on 2016/12/6.
 */
@RestController
@RequestMapping("home")
public class HomeController {

    @Autowired
    private IUserService userService;

    @RequestMapping("helloworld")
    public String helloWorld(){

        return  "hello world";
    }
}
