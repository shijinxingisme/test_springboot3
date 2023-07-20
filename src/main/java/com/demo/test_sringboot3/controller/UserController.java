package com.demo.test_sringboot3.controller;

import com.demo.test_sringboot3.entity.User;
import com.demo.test_sringboot3.service.UserService;
import com.demo.test_sringboot3.vo.base.BaseVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUsrById")
    public BaseVO<User> getUserById(Long id){
        User userById = userService.getUserById(id);
        return BaseVO.data(userById);
    }

    @GetMapping("/getUsrById1")
    public User getUsrById1(Long id){
        return userService.getUserById(id);
    }

}
