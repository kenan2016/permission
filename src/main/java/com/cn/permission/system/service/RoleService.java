package com.cn.permission.system.service;

import com.cn.permission.common.service.IService;
import com.cn.permission.system.domain.Role;
import org.springframework.cache.annotation.CacheConfig;

@CacheConfig(cacheNames = "RoleService")
public interface RoleService extends IService<Role> {

}
