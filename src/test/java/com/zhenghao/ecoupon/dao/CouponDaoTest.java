package com.zhenghao.ecoupon.dao;

import com.zhenghao.ecoupon.entity.Coupon;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

public class CouponDaoTest extends BasicTest {

    @Resource
    private CouponDao couponDao;

    @Test
    public void testAll() throws Exception {
        assertEquals(1, couponDao.insertCoupon(4000, 1000));
        assertEquals(1, couponDao.insertCoupon(4000, 1000));
        assertEquals(1, couponDao.insertCoupon(4000, 1000));
        assertEquals(1, couponDao.insertCoupon(4000, 1000));

        List<Coupon> consumerList = couponDao.queryCouponByOwnerId(1000);
        System.out.println("\n----- query by consumer id -----");
        for(Coupon c : consumerList){
            System.out.println(c);
        }
        System.out.println("----- ----- -----\n");

        assertEquals(1, couponDao.pay(consumerList.get(0).getCouponId(), 2000));
        assertEquals(1, couponDao.pay(consumerList.get(1).getCouponId(), 2000));

        List<Coupon> merchantList = couponDao.queryCouponByOwnerId(2000);
        System.out.println("\n----- query by merchant id -----");
        for(Coupon c : merchantList){
            System.out.println(c);
        }
        System.out.println("----- ----- -----\n");
    }

}