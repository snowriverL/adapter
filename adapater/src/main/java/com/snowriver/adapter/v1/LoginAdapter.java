package com.snowriver.adapter.v1;

import com.snowriver.adapter.ResultMsg;

public interface LoginAdapter {

    boolean support(Object adapter);

    ResultMsg login(Object adapter, Object... params);

}
