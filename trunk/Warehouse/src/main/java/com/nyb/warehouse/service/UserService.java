package com.nyb.warehouse.service;

import com.nyb.warehouse.viewmodel.WebUser;

import java.util.List;

/**
 * Created by aa on 2016/12/7.
 */
public interface UserService {
    boolean insertUser(WebUser webUser);

    WebUser getWebUser(String userID);

    List<WebUser> getWebUserList();
}
