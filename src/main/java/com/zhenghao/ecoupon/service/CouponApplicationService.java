package com.zhenghao.ecoupon.service;

import com.zhenghao.ecoupon.entity.CouponApplication;

import java.util.List;

public interface CouponApplicationService {

    List<CouponApplication> queryAllApplicationByConsumerId(long consumerId);

    List<CouponApplication> queryAllApplicationByMerchantId(long merchantId);

    boolean applyCoupon(long consumerId, long merchantId, long ruleId);

//    boolean offerCoupon(long consumerId, long merchantId, long ruleId);
}
