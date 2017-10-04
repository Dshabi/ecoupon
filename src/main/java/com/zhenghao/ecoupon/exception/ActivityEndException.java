package com.zhenghao.ecoupon.exception;

public class ActivityEndException extends InnerException {

    public ActivityEndException(String message) {
        super(message);
    }

    public ActivityEndException(String message, Throwable cause) {
        super(message, cause);
    }
}
