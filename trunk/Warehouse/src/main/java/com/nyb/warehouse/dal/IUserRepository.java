package com.nyb.warehouse.dal;

import com.nyb.warehouse.entity.UserEntity;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

/**
 * Created by aa on 2016/12/7.
 */
public interface IUserRepository extends JpaRepository<UserEntity, String> {

}
