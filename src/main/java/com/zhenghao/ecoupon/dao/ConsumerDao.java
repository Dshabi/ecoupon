package com.zhenghao.ecoupon.dao;

import com.zhenghao.ecoupon.entity.Consumer;
import org.apache.ibatis.annotations.Param;

public interface ConsumerDao {

    Consumer queryByAccount(@Param("account") long account);
}
