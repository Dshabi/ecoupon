package com.zhenghao.ecoupon.service;

import com.zhenghao.ecoupon.enums.LoginStateEnum;

public interface LoginService {

    LoginStateEnum loginCheck(long account, String password);
}
