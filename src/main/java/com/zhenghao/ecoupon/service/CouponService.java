package com.zhenghao.ecoupon.service;

import com.zhenghao.ecoupon.entity.Coupon;

import java.util.List;

public interface CouponService {

    List<Coupon> queryAllCoupon(long ownerId);
}
