package com.service;

import com.dao.UserOneDao;
import com.dao.UserTwoDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class UserInfoService {
    private UserOneDao userOneDao;
    private UserTwoDao userTwoDao;

    public UserInfoService(UserOneDao userOneDao, UserTwoDao userTwoDao) {
        this.userOneDao = userOneDao;
        this.userTwoDao = userTwoDao;
    }

    @Transactional(readOnly = false)
    public  void txDemo(){
        userOneDao.deleteById();
        userTwoDao.insert();
    }
}
