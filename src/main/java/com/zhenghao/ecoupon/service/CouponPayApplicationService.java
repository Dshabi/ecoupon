package com.zhenghao.ecoupon.service;

import com.zhenghao.ecoupon.entity.CouponPayApplication;

import java.util.List;

public interface CouponPayApplicationService {

    List<CouponPayApplication> queryAllPayApplicationByConsumerId(long consumerId);

    List<CouponPayApplication> queryAllPayApplicationByMerchantId(long merchantId);

    boolean useCoupon(long consumerId, long merchantId, String couponIds);

//    boolean agreeToUse(long consumerId, long merchantId, String couponIds);
}
