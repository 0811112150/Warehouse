package com.nyb.warehouse.dal;

import com.nyb.warehouse.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by aa on 2016/12/7.
 */
public interface UserRepository extends JpaRepository<User, String> {

}
