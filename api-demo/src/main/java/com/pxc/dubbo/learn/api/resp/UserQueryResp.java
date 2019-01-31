package com.pxc.dubbo.learn.api.resp;

import com.pxc.dubbo.learn.api.BaseResp;

import java.io.Serializable;

/**
 * @author pengxincheng@ipaynow.cn
 * @Date: 2019/1/30
 * @Time 15:08
 */
public class UserQueryResp extends BaseResp implements Serializable {

    private String userId;
    private String name;
    private Integer age;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
