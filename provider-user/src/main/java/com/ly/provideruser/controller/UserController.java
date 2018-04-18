package com.ly.provideruser.controller;

import com.ly.provideruser.dao.UserDao;
import com.ly.provideruser.model.User;
import com.ly.provideruser.util.MqMessageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserDao userDao;

    @Autowired
    private JmsTemplate jmsTemplate;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        User user = userDao.findUserById(id);
        logger.info("------------用户id：【{}】--------------", user.getId());
        jmsTemplate.send("user", new MqMessageUtil(user));
        return user;
    }
}
