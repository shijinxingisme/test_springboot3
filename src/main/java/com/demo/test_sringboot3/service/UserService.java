package com.demo.test_sringboot3.service;

import com.demo.test_sringboot3.entity.User;

import java.util.List;

public interface UserService {


    List<User> getAllUser();
    User getUserById(Long id);

    User createUser(User user);

    void deleteUser(Long id);

}
