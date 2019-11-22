package com.cn.permission.system.service;

import com.cn.permission.common.service.IService;
import com.cn.permission.system.domain.User;
import com.cn.permission.system.domain.UserWithRole;
import org.springframework.cache.annotation.CacheConfig;

@CacheConfig(cacheNames = "UserService")
public interface UserService extends IService<User> {
    UserWithRole findById(Long userId);
}
