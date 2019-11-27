package com.service;

import com.entity.UserOne;

import java.util.List;

public interface UserOneService {
    List<UserOne> getPageAll(int pageNum, int pageSize);
}
