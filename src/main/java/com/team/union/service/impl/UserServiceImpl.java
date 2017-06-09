package com.team.union.service.impl;

import com.team.union.domain.User;
import com.team.union.dto.UserMapper;
import com.team.union.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhongxia on 6/9/17.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getByUserId(Long userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
