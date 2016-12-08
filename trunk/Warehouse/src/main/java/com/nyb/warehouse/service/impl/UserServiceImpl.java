package com.nyb.warehouse.service.impl;

import com.nyb.warehouse.dal.UserRepository;
import com.nyb.warehouse.entity.User;
import com.nyb.warehouse.viewmodel.WebUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

/**
 * Created by aa on 2016/12/7.
 */
@Component
public class UserServiceImpl implements com.nyb.warehouse.service.UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean createUser(WebUser webUser) {
        Timestamp currentTime = new Timestamp(System.currentTimeMillis());

        User user = new User();
        user.setUserId(UUID.randomUUID().toString());
        user.setName(webUser.getName());
        user.setCreateDateTime(currentTime);
        user.setAddress(webUser.getAddress());
        user.setEmail(webUser.getEmail());
        user.setIsValid(new Byte("1"));

        userRepository.save(user);
        return false;
    }

    @Override
    public WebUser getWebUserByID(String userID) {
        return null;
    }

    @Override
    public List<WebUser> getWebUserList() {
        return null;
    }
}
