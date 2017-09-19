package com.zhenghao.ecoupon.dao;

import com.zhenghao.ecoupon.entity.CouponRule;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface CouponRuleDao {

    int insertCouponRule(@Param("merchantId") long merchantId,
                         @Param("over") int over,
                         @Param("send") int send,
                         @Param("isAccumulation") int isAccumulation,
                         @Param("quote") int quote,
                         @Param("totalAmount") int totalAmount,
                         @Param("validStartTime") Date validStartTime,
                         @Param("validEndTime") Date validEndTime);

    CouponRule queryByRuleId(@Param("ruleId") long ruleId);

    List<CouponRule> queryAllAvailable(@Param("nowTime") Date nowTime);

    List<CouponRule> queryByMerchantId(@Param("merchantId") long merchantId);

    int cancelByCouponRuleId(@Param("couponRuleId") long couponRuleId);
}
