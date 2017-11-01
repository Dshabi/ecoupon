package com.zhenghao.ecoupon.enums;

public enum LoginStateEnum {
    CONSUMERLOGIN(1, "消费者登录"),
    MERCHANTLOGIN(2, "商家登录"),
    LOGINFAIL(-1, "登录失败");

    private int state;

    private String stateInfo;

    LoginStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public static LoginStateEnum stateOf(int index) {
        for (LoginStateEnum state : values()) {
            if (state.getState() == index) {
                return state;
            }
        }
        return null;
    }
}
