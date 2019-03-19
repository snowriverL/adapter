package com.snowriver.adapter.v1;

import com.snowriver.adapter.ResultMsg;
import com.snowriver.adapter.SiginService;

public class PassportForThirdAdapter extends SiginService implements IPassportForThird {
    public ResultMsg loginForQQ(String id) {
        return processLogin(LoginForQQAdapter.class, id);
    }

    public ResultMsg loginForWechat(String id) {
        return processLogin(LoginForWechatAdapter.class, id);
    }

    public ResultMsg loginForToken(String token) {
        return processLogin(LoginForTokenAdapter.class, token);
    }

    public ResultMsg loginForTelphone(String telphone, String code) {
        return processLogin(LoginForTelAdapter.class, telphone, code);
    }

    public ResultMsg loginForRegist(String username, String passport) {
        super.regist(username,passport);
        return super.login(username, passport);
    }

    private ResultMsg processLogin(Class<? extends LoginAdapter> clazz, Object... keys) {

        try {
            LoginAdapter loginAdapter = clazz.newInstance();

            if (loginAdapter.support(loginAdapter)) {
                return loginAdapter.login(loginAdapter, keys);
            } else {
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }

    public static void main(String[] args) {
        PassportForThirdAdapter adapter = new PassportForThirdAdapter();
        ResultMsg resultMsg = adapter.loginForQQ("983819654");
        System.out.println(resultMsg);
        resultMsg = adapter.login("983819654", "snowriver");
        System.out.println(resultMsg);
        resultMsg = adapter.loginForToken("kjlckjxzghjdgasui");
        System.out.println(resultMsg);
    }
}