package com.snowriver.adapter.v1;

import com.snowriver.adapter.ResultMsg;

public class LoginForQQAdapter implements LoginAdapter{
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    public ResultMsg login(Object adapter, Object... params) {
        return new ResultMsg(200, "qq登录成功", new LoginForQQAdapter());
    }

}