package com.nyb.warehouse.dal;

import com.nyb.warehouse.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by aa on 2016/12/7.
 */
public interface UserRepository extends JpaRepository<User, String> {
    @Query("select u from User u where u.loginName like %?1% or u.loginName = ?1")
    List<User> findUserList(String searchInfo);
}
