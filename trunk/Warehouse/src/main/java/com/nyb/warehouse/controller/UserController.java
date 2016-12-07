package com.nyb.warehouse.controller;

import com.nyb.warehouse.viewmodel.WebUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2016/12/7 0007.
 */
@RestController
@RequestMapping
public class UserController {
    public boolean AddUser(WebUser webUser) {
        return true;
    }

    public WebUser GetUserByID(String userID) {
        WebUser webUser = new WebUser();
        webUser.setAddress("home");
        return webUser;
    }
}
