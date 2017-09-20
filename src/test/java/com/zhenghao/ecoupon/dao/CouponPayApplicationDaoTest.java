package com.zhenghao.ecoupon.dao;

import com.zhenghao.ecoupon.entity.CouponPayApplication;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

public class CouponPayApplicationDaoTest extends BasicTest {

    @Resource
    private CouponPayApplicationDao couponPayApplicationDao;

    @Test
    public void testAll() throws Exception {
        assertEquals(1, couponPayApplicationDao.insertCouponPayApplication(1000, 2000, "3000"));
        assertEquals(1, couponPayApplicationDao.insertCouponPayApplication(1000, 2000, "3001 3002"));

        List<CouponPayApplication> consumerList = couponPayApplicationDao.queryByConsumerId(1000);
        System.out.println("\n----- query by consumer id -----");
        for(CouponPayApplication cpa : consumerList){
            System.out.println(cpa);
        }
        System.out.println("----- ----- -----\n");

        assertEquals(1, couponPayApplicationDao.confirm(consumerList.get(0).getCouponPayApplicationId()));
        assertEquals(1,couponPayApplicationDao.refuse(consumerList.get(1).getCouponPayApplicationId()));

        List<CouponPayApplication> merchantList = couponPayApplicationDao.queryByMerchantId(2000);
        System.out.println("\n----- query by merchant id -----");
        for(CouponPayApplication cpa : merchantList){
            System.out.println(cpa);
        }
        System.out.println("----- ----- -----\n");
    }

}