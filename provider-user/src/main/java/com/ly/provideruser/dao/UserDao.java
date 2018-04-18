package com.ly.provideruser.dao;

import com.ly.provideruser.base.BaseDao;
import com.ly.provideruser.model.User;

public interface UserDao extends BaseDao{

    User findUserById(Long id);
}
