package com.zhenghao.ecoupon.service;

import com.zhenghao.ecoupon.entity.CouponApplication;
import com.zhenghao.ecoupon.entity.CouponPayApplication;
import com.zhenghao.ecoupon.entity.CouponRule;

import java.util.List;

public interface MerchantService {

    List<CouponPayApplication> queryAllPayApplication(long merchantId);

    boolean useCoupon(long consumerId, long merchantId, String couponIds);
}
