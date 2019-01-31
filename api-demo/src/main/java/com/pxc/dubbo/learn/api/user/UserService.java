package com.pxc.dubbo.learn.api.user;

import com.pxc.dubbo.learn.api.req.UserQueryReq;
import com.pxc.dubbo.learn.api.resp.UserQueryResp;

/**
 * @author pengxincheng@ipaynow.cn
 * @Date: 2019/1/30
 * @Time 15:04
 */
public interface UserService {

    UserQueryResp queryUser(UserQueryReq userQueryReq);
}
