package com.zhenghao.ecoupon.dao;

import com.zhenghao.ecoupon.dto.PromotionActivity;
import com.zhenghao.ecoupon.entity.CouponRule;
import org.junit.Test;

import javax.annotation.Resource;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class CouponRuleDaoTest extends BasicTest {

    @Resource
    private CouponRuleDao couponRuleDao;

    @Test
    public void testAll() throws Exception {
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date past1 = dateFormat.parse("2016-8-20 00:00:00");
//        Date past2 = dateFormat.parse("2016-8-30 00:00:00");
//        Date future1 = dateFormat.parse("2016-10-20 00:00:00");
//        Date future2 = dateFormat.parse("2016-10-30 00:00:00");
//
//        //not started
//        assertEquals(1, couponRuleDao.insertCouponRule(2000, 100, 20, 1, 1000, 2000, future1, future2));
//        //finished
//        assertEquals(1, couponRuleDao.insertCouponRule(2000, 100, 20, 1, 1000, 2000, past1, past2));
//        //offering
//        assertEquals(1, couponRuleDao.insertCouponRule(2000, 100, 20, 1, 1000, 2000, past1, future2));
//        //to be cancelled
//        assertEquals(1, couponRuleDao.insertCouponRule(2000, 100, 20, 1, 1000, 2000, past1, future2));
//
//        Date now = dateFormat.parse("2016-9-21 03:00:00");
//
//        List<PromotionActivity> availableList = couponRuleDao.queryAvailablePromotionActivity(now);
//        assertEquals(4, availableList.size());
//        System.out.println("\n----- query all available -----");
//        for(PromotionActivity pa : availableList){
//            System.out.println(pa);
//        }
//        System.out.println("----- ----- -----\n");
//
//        assertEquals(1, couponRuleDao.cancelByCouponRuleId(availableList.get(1).getCouponRuleId()));
//
//        assertEquals(1, couponRuleDao.updateSentAmountByRuleId(100, availableList.get(0).getCouponRuleId()));
//
//        List<CouponRule> merchantList = couponRuleDao.queryByMerchantId(2000);
//        assertEquals(6, merchantList.size());
//        System.out.println("\n----- query by merchant id -----");
//        for(CouponRule cr : merchantList){
//            System.out.println(cr);
//        }
//        System.out.println("----- ----- -----\n");
//
//        CouponRule couponRule = couponRuleDao.queryByRuleId(merchantList.get(0).getCouponRuleId());
//        System.out.println("\n----- query by rule id -----");
//        System.out.println(couponRule);
//        System.out.println("----- ----- -----\n");
    }

}