package com.zhenghao.ecoupon.dao;

import com.zhenghao.ecoupon.entity.CouponPayApplication;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CouponPayApplicationDao {

    int insertCouponPayApplication(@Param("consumerId") long consumerId,
                                   @Param("merchantId") long merchantId,
                                   @Param("couponIds") String couponIds);

    List<CouponPayApplication> queryByMerchantId(@Param("merchantId") long merchantId);

    int confirm(@Param("couponPayApplicationId") long couponPayApplicationId);

    int refuse(@Param("couponPayApplicationId") long couponPayApplicationId);

    List<CouponPayApplication> queryByConsumerId(@Param("consumerId") long consumerId);
}
