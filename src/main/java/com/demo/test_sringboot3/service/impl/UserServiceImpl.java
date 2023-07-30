package com.demo.test_sringboot3.service.impl;

import com.demo.test_sringboot3.dao.UserDao;
import com.demo.test_sringboot3.entity.User;
import com.demo.test_sringboot3.service.UserService;
import com.demo.test_sringboot3.vo.user.S_User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public List<User> getAllUser() {
        return userDao.findAll();
    }

    @Override
    public User getUserById(Long id) {
//        return userDao.getReferenceById(id);
        return userDao.getById(id);
    }

    @Override
    public User createUser(User user) {
        return userDao.saveAndFlush(user);
    }

    @Override
    public void deleteUser(Long id) {
        userDao.deleteById(id);
    }

    @Override
    public User getUserByUserNameAndPwd(User user) {
        User u =  userDao.getUserByNameAndPwd(user.getUserName(), user.getPassWord());
        return u;

    }
}
