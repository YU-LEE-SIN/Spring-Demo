package com.service;


import com.entity.UserInfo;

import java.util.List;

public interface UserInfoService {
     List<UserInfo> getUserInfoByPage(int pageNo,int pageSize);
}
