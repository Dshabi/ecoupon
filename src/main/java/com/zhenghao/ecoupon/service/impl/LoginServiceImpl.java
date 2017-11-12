package com.zhenghao.ecoupon.service.impl;

import com.zhenghao.ecoupon.dao.ConsumerDao;
import com.zhenghao.ecoupon.dao.MerchantDao;
import com.zhenghao.ecoupon.dto.LoginResult;
import com.zhenghao.ecoupon.entity.Consumer;
import com.zhenghao.ecoupon.entity.Merchant;
import com.zhenghao.ecoupon.enums.LoginStateEnum;
import com.zhenghao.ecoupon.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private ConsumerDao consumerDao;

    @Autowired
    private MerchantDao merchantDao;

    @Override
    public LoginResult loginCheck(long account, String password) {
        Consumer consumer = consumerDao.queryByAccount(account);
        if(consumer != null) {
            if(consumer.getPassword().equals(password)) {
                return new LoginResult<>(LoginStateEnum.CONSUMERLOGIN, consumer);
            }
            else
                return new LoginResult<>(LoginStateEnum.LOGINFAIL, null);
        }
        Merchant merchant = merchantDao.queryByAccount(account);
        if(merchant != null) {
            if(merchant.getPassword().equals(password))
                return new LoginResult<>(LoginStateEnum.MERCHANTLOGIN, merchant);
            else
                return new LoginResult<>(LoginStateEnum.LOGINFAIL, null);
        }
        return new LoginResult<>(LoginStateEnum.LOGINFAIL, null);
    }
}
