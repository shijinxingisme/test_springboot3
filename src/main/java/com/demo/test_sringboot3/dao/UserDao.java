package com.demo.test_sringboot3.dao;

import com.demo.test_sringboot3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserDao extends JpaRepository<User, Long> {

    @Query("select u from User u where u.userName = ?1 and u.passWord = ?2 ")
    public User getUserByNameAndPwd(String username,String password);


}
