package com.zhenghao.ecoupon.dao;

import com.zhenghao.ecoupon.entity.CouponApplication;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CouponApplicationDao {

    int insertCouponApplication(@Param("consumerId") long consumerId,
                                @Param("merchantId") long merchantId,
                                @Param("ruleId") long ruleId);

    List<CouponApplication> queryByMerchantId(@Param("merchantId") long merchantId);

    List<CouponApplication> queryByConsumerId(@Param("consumerId") long consumerId);

    int confirm(@Param("couponApplicationId") long couponApplicationId,
                      @Param("couponNumber") int couponNumber);

    int refuse(@Param("couponApplicationId") long couponApplicationId);
}
