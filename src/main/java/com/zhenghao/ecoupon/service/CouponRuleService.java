package com.zhenghao.ecoupon.service;

import com.zhenghao.ecoupon.dto.PromotionActivity;

import java.util.List;

public interface CouponRuleService {

    List<PromotionActivity> queryAvailablePromotionActivity();
}
