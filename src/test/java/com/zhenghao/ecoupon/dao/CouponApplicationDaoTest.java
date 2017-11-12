package com.zhenghao.ecoupon.dao;

import com.zhenghao.ecoupon.entity.CouponApplication;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class CouponApplicationDaoTest extends BasicTest {

    @Resource
    private CouponApplicationDao couponApplicationDao;

    @Test
    public void testAllMethods() throws Exception {
//        assertEquals(1, couponApplicationDao.insertCouponApplication(1000, 2000, 4000));
//        TimeUnit.MILLISECONDS.sleep(2000);
//        assertEquals(1, couponApplicationDao.insertCouponApplication(1000, 2000, 4000));
//
//        List<CouponApplication> merchantList = couponApplicationDao.queryByMerchantId(2000);
//        assertEquals(2, merchantList.size());
//        System.out.println("\n----- query by merchant id -----");
//        for(CouponApplication ca : merchantList){
//            System.out.println(ca);
//        }
//        System.out.println("----- ----- -----\n");
//
//        List<CouponApplication> consumerList = couponApplicationDao.queryByConsumerId(1000);
//        assertEquals(2, consumerList.size());
//        System.out.println("\n----- query by consumer id -----");
//        for(CouponApplication ca : consumerList){
//            System.out.println(ca);
//        }
//        System.out.println("----- ----- -----\n");
//
//        assertEquals(1, couponApplicationDao.
//                confirm(merchantList.get(0).getCouponApplicationId(), 2));
//        assertEquals(1, couponApplicationDao.
//                refuse(merchantList.get(1).getCouponApplicationId()));
//
//        List<CouponApplication> merchantList2 = couponApplicationDao.queryByMerchantId(2000);
//        assertEquals(2, merchantList2.size());
//        System.out.println("\n----- query by merchant id -----");
//        for(CouponApplication ca : merchantList2){
//            System.out.println(ca);
//        }
//        System.out.println("----- ----- -----\n");
    }

}