package com.nyb.warehouse.controller;

import com.nyb.warehouse.dal.UserRepository;
import com.nyb.warehouse.viewmodel.WebUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2016/12/7 0007.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public boolean AddUser(@RequestBody WebUser webUser) {

        return true;
    }

    @RequestMapping(value = "/{userid}", method = RequestMethod.GET)
    public WebUser GetUserByID(@PathVariable("userid") String userID) {
        WebUser webUser = new WebUser();
        webUser.setAddress("home");
        return webUser;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public WebUser GetUsers() {
        WebUser webUser = new WebUser();
        webUser.setAddress("home");
        return webUser;
    }
}
