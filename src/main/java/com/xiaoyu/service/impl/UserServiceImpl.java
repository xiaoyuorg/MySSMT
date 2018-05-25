package com.xiaoyu.service.impl;

import com.xiaoyu.dao.UserTMapper;
import com.xiaoyu.pojo.UserT;
import com.xiaoyu.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("t_userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private UserTMapper userDao;

    @Override
    public UserT getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }
}
