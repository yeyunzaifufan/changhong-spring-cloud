package com.ly.consumermovie.listener;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.ly.consumermovie.responsemodel.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class UserListener {

    private static final Logger logger = LoggerFactory.getLogger(UserListener.class);

    @JmsListener(destination = "user")
    public void receiveMessage(String mqMessage){
        logger.info("----------接收到mq的消息：【{}】-----------",mqMessage);
        User user = JSON.parseObject(mqMessage, new TypeReference<User>(){});
        logger.info("----------接收到mq的消息的用户名：【{}】-----------",user.getUsername());
    }
}
