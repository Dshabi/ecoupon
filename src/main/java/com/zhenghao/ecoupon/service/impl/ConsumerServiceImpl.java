package com.zhenghao.ecoupon.service.impl;

import com.zhenghao.ecoupon.dao.CouponApplicationDao;
import com.zhenghao.ecoupon.dao.CouponDao;
import com.zhenghao.ecoupon.dao.CouponPayApplicationDao;
import com.zhenghao.ecoupon.dao.CouponRuleDao;
import com.zhenghao.ecoupon.entity.Coupon;
import com.zhenghao.ecoupon.entity.CouponApplication;
import com.zhenghao.ecoupon.entity.CouponPayApplication;
import com.zhenghao.ecoupon.entity.CouponRule;
import com.zhenghao.ecoupon.exception.ActivityEndException;
import com.zhenghao.ecoupon.exception.InnerException;
import com.zhenghao.ecoupon.service.ConsumerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CouponDao couponDao;

    @Autowired
    private CouponRuleDao couponRuleDao;

    @Autowired
    private CouponApplicationDao couponApplicationDao;

    @Autowired
    private CouponPayApplicationDao couponPayApplicationDao;

    @Override
    public List<Coupon> queryAllCoupon(long consumerId) {
        return couponDao.queryCouponByOwnerId(consumerId);
    }

    @Override
    public boolean applyCoupon(long consumerId, long merchantId, long ruleId)
            throws ActivityEndException, InnerException {
        Date now = new Date();
        try {
            CouponRule rule = couponRuleDao.queryByRuleId(ruleId);
            if (rule.getValidEndTime().before(now)) {
                throw new ActivityEndException("activity is over");
            }
            int count = couponApplicationDao.insertCouponApplication(consumerId, merchantId, ruleId);

            return count == 1;
        } catch (ActivityEndException e1) {
            throw e1;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new InnerException("inner error: " + e.getMessage());
        }
    }

    @Override
    public List<CouponApplication> queryAllApplication(long consumerId){
        return couponApplicationDao.queryByConsumerId(consumerId);
    }

    @Override
    public boolean useCoupon(long consumerId, long merchantId, String couponIds)
            throws InnerException{
        try{
            int count = couponPayApplicationDao.insertCouponPayApplication(consumerId, merchantId, couponIds);

            return count == 1;
        } catch(Exception e){
            logger.error(e.getMessage(), e);
            throw new InnerException("inner error: " + e.getMessage());
        }
    }

    @Override
    public List<CouponPayApplication> queryAllPayApplication(long consumerId){
        return couponPayApplicationDao.queryByConsumerId(consumerId);
    }
}
