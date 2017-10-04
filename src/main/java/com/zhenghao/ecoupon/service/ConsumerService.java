package com.zhenghao.ecoupon.service;

import com.zhenghao.ecoupon.entity.Coupon;
import com.zhenghao.ecoupon.entity.CouponApplication;
import com.zhenghao.ecoupon.entity.CouponPayApplication;
import com.zhenghao.ecoupon.entity.CouponRule;

import java.util.List;

public interface ConsumerService {

    List<Coupon> queryAllCoupon(long consumerId);

    boolean applyCoupon(long consumerId, long merchantId, long ruleId);

    List<CouponApplication> queryAllApplication(long consumerId);

    boolean useCoupon(long consumerId, long merchantId, String couponIds);

    List<CouponPayApplication> queryAllPayApplication(long consumerId);
}
