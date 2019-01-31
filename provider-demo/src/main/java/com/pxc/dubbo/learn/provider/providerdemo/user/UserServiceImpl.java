package com.pxc.dubbo.learn.provider.providerdemo.user;

import com.alibaba.fastjson.JSON;
import com.pxc.dubbo.learn.api.req.UserQueryReq;
import com.pxc.dubbo.learn.api.resp.UserQueryResp;
import com.pxc.dubbo.learn.api.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author pengxincheng@ipaynow.cn
 * @Date: 2019/1/30
 * @Time 15:21
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public UserQueryResp queryUser(UserQueryReq userQueryReq) {
        logger.info("收到请求：{}",JSON.toJSONString(userQueryReq));

        UserQueryResp userQueryResp = new UserQueryResp();
        userQueryResp.setUserId(userQueryReq.getUserId());
        userQueryResp.setName("测试");
        userQueryResp.setAge(22);
        userQueryResp.setCode("0000");
        userQueryResp.setMsg("成功");
/*
        try {
            TimeUnit.SECONDS.sleep(7);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        return userQueryResp;
    }
}
