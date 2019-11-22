package com.cn.permission.system.service.impl;

import com.cn.permission.common.service.impl.BaseService;
import com.cn.permission.system.dao.RoleMapper;
import com.cn.permission.system.domain.Role;
import com.cn.permission.system.service.RoleService;
import com.cn.permission.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository("roleService")
public class RoleServiceImp extends BaseService<Role> implements RoleService {

}
