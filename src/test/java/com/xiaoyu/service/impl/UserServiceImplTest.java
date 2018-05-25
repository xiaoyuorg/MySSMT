package com.xiaoyu.service.impl;

import com.alibaba.fastjson.JSON;
import com.xiaoyu.pojo.UserT;
import com.xiaoyu.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

//配置spring和junit整合，这样junit在启动时就会加载spring容器
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件
@ContextConfiguration({"classpath:spring-mvc.xml","classpath:spring-mybatis.xml"})

public class UserServiceImplTest {
    private static Logger logger = Logger.getLogger(UserServiceImplTest.class);

    @Resource
    private IUserService userService = null;
    @Test
    public void getUserById() {
        int userId = 1;
        UserT user = userService.getUserById(userId);

        logger.info(JSON.toJSONString(user));
    }
}