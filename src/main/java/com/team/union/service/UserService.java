package com.team.union.service;

import com.team.union.domain.User;

/**
 * Created by zhongxia on 6/9/17.
 */
public interface UserService {

    User getByUserId(Long userId);
}
