package com.demo.test_sringboot3.controller;

import com.demo.test_sringboot3.entity.User;
import com.demo.test_sringboot3.service.UserService;
import com.demo.test_sringboot3.vo.base.BaseVO;
import com.demo.test_sringboot3.vo.user.S_User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserAdminController {

    @Autowired
    private UserService userService;

    @RequestMapping("/admin_login")
    public BaseVO<User> adminLogin(@RequestBody User user){
        User user1 = userService.getUserByUserNameAndPwd(user);
        return BaseVO.data(user1);
    }

    @GetMapping("/getUsrById1")
    public User getUsrById1(Long id){
        return userService.getUserById(id);
    }

}
