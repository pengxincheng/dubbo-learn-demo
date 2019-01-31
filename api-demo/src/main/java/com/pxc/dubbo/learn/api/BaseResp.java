package com.pxc.dubbo.learn.api;

/**
 * @author pengxincheng@ipaynow.cn
 * @Date: 2019/1/30
 * @Time 15:07
 */
public class BaseResp {

    private String code;//响应码
    private String msg;//响应消息

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
