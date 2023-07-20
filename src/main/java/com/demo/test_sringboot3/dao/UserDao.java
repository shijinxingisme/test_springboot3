package com.demo.test_sringboot3.dao;

import com.demo.test_sringboot3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
}
