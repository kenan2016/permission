package com.cn.permission.system.service.impl;

import com.cn.permission.common.service.impl.BaseService;
import com.cn.permission.system.dao.UserMapper;
import com.cn.permission.system.domain.User;
import com.cn.permission.system.domain.UserWithRole;
import com.cn.permission.system.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class UserServiceImpl extends BaseService<User> implements UserService {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserMapper userMapper;
    @Override
    public UserWithRole findById(Long userId) {
        UserWithRole userWithRole = this.userMapper.findUserWithRole(userId);
        return userWithRole;
    }
}
