package com.cn.permission;

import com.cn.permission.system.domain.Role;
import com.cn.permission.system.service.RoleService;
import com.cn.permission.system.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = PermissionApplication.class)
public class PermissionApplicationTests {
    @Autowired
    private RoleService roleService;


//    @Test
//    void contextLoads() {
//    }
    @Test
    public void test() throws Exception {
        Role role = new Role();
        role.setRoleId(Long.valueOf(2));
        role.setCreateTime(new Date());
        role.setModifyTime(new Date());
        role.setRemark("测试角色-通用mapper");
        role.setRoleName("testROle");
        this.roleService.save(role);
    }

}
