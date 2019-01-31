package com.pxc.dubbo.learn.consumer.consumerdemo.user.controller;

import com.alibaba.fastjson.JSON;
import com.pxc.dubbo.learn.api.req.UserQueryReq;
import com.pxc.dubbo.learn.api.resp.UserQueryResp;
import com.pxc.dubbo.learn.api.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author pengxincheng@ipaynow.cn
 * @Date: 2019/1/30
 * @Time 16:29
 */
@RestController
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserService userService;

    @GetMapping("/{userId}")
    public UserQueryResp test1(@PathVariable("userId") String userId){

        logger.info("测试userId={}",userId);
        UserQueryReq userQueryReq = new UserQueryReq();
        userQueryReq.setUserId(userId);
        UserQueryResp userQueryResp = userService.queryUser(userQueryReq);
        logger.info("出参：{}", JSON.toJSONString(userQueryResp));

        //测试缓存
        for (int i=0;i<100;i++){
            UserQueryReq userQueryReq1 = new UserQueryReq();
            userQueryReq1.setUserId(userId);
           logger.info(JSON.toJSONString( userQueryResp = userService.queryUser(userQueryReq1)));
        }

        return userQueryResp;
    }
}
