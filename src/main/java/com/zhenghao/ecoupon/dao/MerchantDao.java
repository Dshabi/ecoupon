package com.zhenghao.ecoupon.dao;

import com.zhenghao.ecoupon.entity.Merchant;
import org.apache.ibatis.annotations.Param;

public interface MerchantDao {

    Merchant queryByAccount(@Param("account") long account);
}
