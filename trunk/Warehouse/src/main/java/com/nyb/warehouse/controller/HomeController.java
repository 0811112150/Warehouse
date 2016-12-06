package com.nyb.warehouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by aa on 2016/12/6.
 */
@RestController
public class HomeController {

    @RequestMapping("helloworld")
    public String helloWorld(){
        return  "hello world";
    }
}
