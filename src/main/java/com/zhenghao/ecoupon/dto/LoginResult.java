package com.zhenghao.ecoupon.dto;

import com.zhenghao.ecoupon.enums.LoginStateEnum;

public class LoginResult<T> {
    private LoginStateEnum loginStateEnum;

    private T data;

    public LoginResult(LoginStateEnum loginStateEnum, T data) {
        this.loginStateEnum = loginStateEnum;
        this.data = data;
    }

    public LoginStateEnum getLoginStateEnum() {
        return loginStateEnum;
    }

    public void setLoginStateEnum(LoginStateEnum loginStateEnum) {
        this.loginStateEnum = loginStateEnum;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
