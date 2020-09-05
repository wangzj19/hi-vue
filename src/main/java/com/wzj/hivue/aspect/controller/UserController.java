package com.wzj.hivue.aspect.controller;

import com.wzj.hivue.aspect.service.UserService;
import com.wzj.hivue.aspect.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    /* 注入用户服务 */
    @Autowired
    private UserService userService = null;
    /* 定义请求 */
    @RequestMapping("/print")
    @ResponseBody
    public User printUser(Long id, String userName, String note){
        User user = new User();
        user.setId(id);
        user.setUserName(userName);
        user.setNote(note);
        userService.printUser(user);
        return user;
    }

}
