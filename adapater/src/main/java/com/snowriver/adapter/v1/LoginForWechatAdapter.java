package com.snowriver.adapter.v1;

import com.snowriver.adapter.ResultMsg;

public class LoginForWechatAdapter implements LoginAdapter{
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }

    public ResultMsg login(Object adapter, Object... params) {
        return new ResultMsg(200, "微信登录成功", new LoginForWechatAdapter());
    }

}