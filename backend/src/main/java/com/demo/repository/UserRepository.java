package com.demo.repository;

import com.demo.entity.User;

/**
 * Created by stephan on 20.03.16.
 */
public interface UserRepository {

    User findByUsername(String username);

}
