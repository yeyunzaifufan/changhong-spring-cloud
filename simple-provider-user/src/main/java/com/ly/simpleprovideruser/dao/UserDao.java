package com.ly.simpleprovideruser.dao;

import com.ly.simpleprovideruser.base.BaseDao;
import com.ly.simpleprovideruser.model.User;

public interface UserDao extends BaseDao{

    User findUserById(Long id);
}
