package com.cn.permission.system.dao;

import com.cn.permission.common.config.MyMapper;
import com.cn.permission.system.domain.Role;

public interface RoleMapper extends MyMapper<Role> {
    int add(Role role);
}
