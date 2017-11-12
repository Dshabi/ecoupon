package com.zhenghao.ecoupon.service.impl;

import com.zhenghao.ecoupon.dao.CouponDao;
import com.zhenghao.ecoupon.entity.Coupon;
import com.zhenghao.ecoupon.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CouponServiceImpl implements CouponService{

    @Autowired
    private CouponDao couponDao;

    @Override
    public List<Coupon> queryAllCoupon(long consumerId) {
        return couponDao.queryCouponByOwnerId(consumerId);
    }
}
