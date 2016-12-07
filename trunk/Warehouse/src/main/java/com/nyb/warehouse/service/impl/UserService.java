package com.nyb.warehouse.service.impl;

import com.nyb.warehouse.dal.IUserRepository;
import com.nyb.warehouse.entity.UserEntity;
import com.nyb.warehouse.service.IUserService;
import com.nyb.warehouse.viewmodel.WebUser;
import org.apache.catalina.User;
import org.hibernate.id.GUIDGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by aa on 2016/12/7.
 */
@Component
public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public boolean insertUser(WebUser webUser) {
        UserEntity userEntity=new UserEntity();
        userEntity.setId(UUID.randomUUID().toString());
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
