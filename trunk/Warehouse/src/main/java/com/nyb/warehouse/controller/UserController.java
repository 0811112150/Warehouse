package com.nyb.warehouse.controller;

import com.nyb.warehouse.service.UserService;
import com.nyb.warehouse.viewmodel.WebUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2016/12/7 0007.
 */
@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/CreateUser", method = RequestMethod.POST)
    public boolean CreateUser(@RequestBody WebUser webUser) {

        return true;
    }

    @RequestMapping(value = "/GetUserByID/{UserId}", method = RequestMethod.GET)
    public WebUser GetUserByID(@PathVariable("UserId") String userID) {
        WebUser webUser = new WebUser();
        webUser.setAddress("home");
        return webUser;
    }

    @RequestMapping(value = "/GetUsers", method = RequestMethod.GET)
    public WebUser GetUsers() {
        WebUser webUser = new WebUser();
        webUser.setAddress("home");
        return webUser;
    }
}
