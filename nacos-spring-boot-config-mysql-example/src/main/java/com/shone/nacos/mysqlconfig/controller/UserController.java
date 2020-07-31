package com.shone.nacos.mysqlconfig.controller;

import com.shone.nacos.mysqlconfig.model.User;
import com.shone.nacos.mysqlconfig.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * DemoClass
 *
 * @author Xiao GuoJian
 * @date 2020/7/31 下午3:53
 */

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {this.userService = userService;}

    @GetMapping
    @ResponseBody
    public User get(@RequestParam int id) {
        return userService.findById(id);
    }
}
