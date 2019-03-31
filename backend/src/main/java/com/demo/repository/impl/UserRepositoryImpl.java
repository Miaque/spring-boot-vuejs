package com.demo.repository.impl;

import com.demo.entity.Authority;
import com.demo.entity.User;
import com.demo.mapper.AuthorityMapper;
import com.demo.mapper.UserMapper;
import com.demo.repository.UserRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Resource
    private UserMapper userMapper;

    @Override
    public User findByUsername(String username) {

        return userMapper.findByUsername(username);

    }

}
