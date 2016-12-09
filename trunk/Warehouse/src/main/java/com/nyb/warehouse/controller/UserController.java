package com.nyb.warehouse.controller;

import com.nyb.warehouse.common.CResult;
import com.nyb.warehouse.service.UserService;
import com.nyb.warehouse.viewmodel.WebUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2016/12/7 0007.
 */
@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/CreateUser", method = RequestMethod.POST)
    public CResult<Boolean> CreateUser(@RequestBody WebUser webUser) {
        boolean result = userService.createUser(webUser);
        return new CResult<Boolean>(result);
    }

    @RequestMapping(value = "/GetUserByID/{UserId}", method = RequestMethod.GET)
    public CResult<WebUser> GetUserByID(@PathVariable("UserId") String userID) {
        WebUser webUser = userService.getWebUserByID(userID);
        return new CResult<WebUser>(webUser);
    }

    @RequestMapping(value = "/GetUsers", method = RequestMethod.GET)
    public CResult<List<WebUser>> GetUsers() {
        return new CResult<List<WebUser>>(userService.getWebUserList(""));
    }
}
