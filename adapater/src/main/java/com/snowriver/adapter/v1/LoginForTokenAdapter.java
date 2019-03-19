package com.snowriver.adapter.v1;

import com.snowriver.adapter.ResultMsg;

public class LoginForTokenAdapter implements LoginAdapter{
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }

    public ResultMsg login(Object adapter, Object... params) {
        return new ResultMsg(200, "Token登录成功", new LoginForTokenAdapter());
    }

}