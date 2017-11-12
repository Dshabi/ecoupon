package com.zhenghao.ecoupon.service;

import com.zhenghao.ecoupon.dto.LoginResult;
import com.zhenghao.ecoupon.enums.LoginStateEnum;

public interface LoginService {

    LoginResult loginCheck(long account, String password);
}
