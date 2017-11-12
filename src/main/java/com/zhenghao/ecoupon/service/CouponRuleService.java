package com.zhenghao.ecoupon.service;

import com.zhenghao.ecoupon.dto.PromotionActivity;
import com.zhenghao.ecoupon.entity.CouponRule;

import java.util.List;

public interface CouponRuleService {

    List<PromotionActivity> queryAvailablePromotionActivity();

    List<CouponRule> queryAllCouponRuleById(long ownerId);
}
