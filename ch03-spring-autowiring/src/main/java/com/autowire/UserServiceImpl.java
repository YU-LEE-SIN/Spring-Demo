package com.autowire;

public class UserServiceImpl implements UserService {
   private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void insert() {
        userDao.insert();
    }
}
