package com.zhenghao.ecoupon.enums;

public enum ApplicationStateEnum {
    UNDISPOSED(0, "未处理"),
    SUCCESS(1, "申请成功"),
    REFUSED(-1, "拒绝申请");


    private int state;

    private String stateInfo;

    ApplicationStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public static ApplicationStateEnum stateOf(int index) {
        for (ApplicationStateEnum state : values()) {
            if (state.getState() == index) {
                return state;
            }
        }
        return null;
    }
}
