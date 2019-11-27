package com.service.impl;

import com.dao.UserOneDao;
import com.entity.UserOne;
import com.service.UserOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserOneServiceImpl implements UserOneService {
    @Autowired
    private UserOneDao dao;

    @Transactional
    @Override
    public List<UserOne> getPageAll(int pageNum, int pageSize) {
        return dao.getPageAll(pageNum, pageSize);
    }
}
