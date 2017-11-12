package com.zhenghao.ecoupon.service.impl;

import com.zhenghao.ecoupon.dao.CouponRuleDao;
import com.zhenghao.ecoupon.dto.PromotionActivity;
import com.zhenghao.ecoupon.entity.CouponRule;
import com.zhenghao.ecoupon.service.CouponRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CouponRuleServiceImpl implements CouponRuleService {

    @Autowired
    private CouponRuleDao couponRuleDao;

    @Override
    public List<PromotionActivity> queryAvailablePromotionActivity() {
        Date now = new Date();

        return couponRuleDao.queryAvailablePromotionActivity(now);
    }

    @Override
    public List<CouponRule> queryAllCouponRuleById(long ownerId) {
        return couponRuleDao.queryByMerchantId(ownerId);
    }
}
