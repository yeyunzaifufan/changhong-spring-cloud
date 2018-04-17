package com.ly.simpleprovideruser.controller;

import com.ly.simpleprovideruser.dao.UserDao;
import com.ly.simpleprovideruser.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserDao userDao;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        User user = userDao.findUserById(id);
        logger.info("------------用户id：【{}】--------------", user.getId());
        return user;
    }
}
