package com.cn.permission.system.dao;

import com.cn.permission.common.config.MyMapper;
import com.cn.permission.system.domain.User;
import com.cn.permission.system.domain.UserWithRole;

public interface UserMapper extends MyMapper<User> {
    UserWithRole findUserWithRole(Long userId);
}
