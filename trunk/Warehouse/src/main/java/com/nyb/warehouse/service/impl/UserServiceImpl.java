package com.nyb.warehouse.service.impl;

import com.nyb.warehouse.dal.UserRepository;
import com.nyb.warehouse.entity.User;
import com.nyb.warehouse.modelmapper.UserMapper;
import com.nyb.warehouse.viewmodel.WebUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean createUser(WebUser webUser) {
        Timestamp currentTime = new Timestamp(System.currentTimeMillis());

        User user = userMapper.viewModelToEntity(webUser);

        user.setUserId(UUID.randomUUID().toString());
        user.setCreateDateTime(currentTime);
        user.setLastLoginTime(currentTime);
        user.setIsValid(true);

        User result = userRepository.save(user);

        return true;
    }

    @Override
    public WebUser getWebUserByID(String userID) {
        User user = userRepository.findOne(userID);
        WebUser webUser = userMapper.entityToViewModel(user);
        return webUser;
    }

    @Override
    public List<WebUser> getWebUserList(String searchInfo) {
        List<User> users = userRepository.findUserList(searchInfo);
        return userMapper.entityToViewModels(users);
    }
}
