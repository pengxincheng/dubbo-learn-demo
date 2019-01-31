package com.pxc.dubbo.learn.api.req;

import java.io.Serializable;

/**
 * @author pengxincheng@ipaynow.cn
 * @Date: 2019/1/30
 * @Time 15:09
 */
public class UserQueryReq implements Serializable {

    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
