package com.snowriver.adapter.v1;

import com.snowriver.adapter.ResultMsg;

public class LoginForSinaAdapter implements LoginAdapter{
    public boolean support(Object adapter) {
        return adapter instanceof LoginForSinaAdapter;
    }

    public ResultMsg login(Object adapter, Object... params) {
        return new ResultMsg(200, "微博登录成功", new LoginForSinaAdapter());
    }

}