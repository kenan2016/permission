package com.cn.permission.system.controller;

import com.cn.permission.common.controller.BaseController;
import com.cn.permission.common.domain.ResponseBo;
import com.cn.permission.system.domain.User;
import com.cn.permission.system.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController extends BaseController {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @RequestMapping("user/getUser")
    @ResponseBody
        public ResponseBo getUser(Long userId) {
        User user = this.userService.findById(userId);
        return ResponseBo.ok(user);
    }
}
