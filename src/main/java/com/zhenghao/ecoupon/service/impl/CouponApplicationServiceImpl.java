package com.zhenghao.ecoupon.service.impl;

import com.zhenghao.ecoupon.dao.CouponApplicationDao;
import com.zhenghao.ecoupon.dao.CouponRuleDao;
import com.zhenghao.ecoupon.entity.CouponApplication;
import com.zhenghao.ecoupon.entity.CouponRule;
import com.zhenghao.ecoupon.exception.ActivityEndException;
import com.zhenghao.ecoupon.exception.InnerException;
import com.zhenghao.ecoupon.service.CouponApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CouponApplicationServiceImpl implements CouponApplicationService {

    @Autowired
    private CouponRuleDao couponRuleDao;

    @Autowired
    private CouponApplicationDao couponApplicationDao;

    @Override
    public List<CouponApplication> queryAllApplicationByConsumerId(long consumerId) {
        return couponApplicationDao.queryByConsumerId(consumerId);
    }

    @Override
    public List<CouponApplication> queryAllApplicationByMerchantId(long merchantId) {
        return couponApplicationDao.queryByMerchantId(merchantId);
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
            //TODO log
//            logger.error(e.getMessage(), e);
            throw new InnerException("inner error: " + e.getMessage());
        }
    }

}
