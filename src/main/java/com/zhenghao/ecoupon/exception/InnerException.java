package com.zhenghao.ecoupon.exception;

public class InnerException extends RuntimeException {

    public InnerException(String message) {
        super(message);
    }

    public InnerException(String message, Throwable cause) {
        super(message, cause);
    }
}
