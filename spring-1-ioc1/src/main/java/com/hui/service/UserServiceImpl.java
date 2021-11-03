package com.hui.service;

import com.hui.dao.UserDao;
import com.hui.dao.UserDaoImpl;
import com.hui.dao.UserDaoMysqlImpl;
import com.hui.dao.UserDaoOracelImpl;

public class UserServiceImpl implements UserService{

//    UserDao userDao = new UserDaoImpl();
//    UserDao userDao = new UserDaoMysqlImpl();
//    UserDao userDao = new UserDaoOracelImpl();

    private UserDao userDao;

    //利用set实现值的动态注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
