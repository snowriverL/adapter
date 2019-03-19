package com.snowriver.adapter.v1;

import com.snowriver.adapter.ResultMsg;

public class LoginForTelAdapter implements LoginAdapter{
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    public ResultMsg login(Object adapter, Object... params) {
        return new ResultMsg(200, "手机号登录成功", new LoginForTelAdapter());
    }

}