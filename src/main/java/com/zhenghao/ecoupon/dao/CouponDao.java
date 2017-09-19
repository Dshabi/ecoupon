package com.zhenghao.ecoupon.dao;

import com.zhenghao.ecoupon.entity.Coupon;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CouponDao {

    int insertCoupon(@Param("ruleId") long ruleId, @Param("ownerId") long ownerId);

    List<Coupon> queryCouponByOwnerId(@Param("ownerId") long owenerId);

    int updateOwner(@Param("couponId") long couponId, @Param("merchantId") long merchantId);
}
