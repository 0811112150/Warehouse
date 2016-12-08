package com.nyb.warehouse.service.impl;

import com.nyb.warehouse.dal.UserRepository;
import com.nyb.warehouse.entity.User;
import com.nyb.warehouse.viewmodel.WebUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
    public boolean insertUser(WebUser webUser) {
        User userEntity=new User();
        userEntity.setUserId(UUID.randomUUID().toString());
        userEntity.setName(webUser.getName());
//        userEntity.setCreateDateTime(new DateTime());

        userRepository.save(userEntity);
        return false;
    }

    @Override
    public WebUser getWebUser(String userID) {
        return null;
    }

    @Override
    public List<WebUser> getWebUserList() {
        return null;
    }
}
