package com.zhenghao.ecoupon.service.impl;

import com.zhenghao.ecoupon.dao.CouponPayApplicationDao;
import com.zhenghao.ecoupon.entity.CouponPayApplication;
import com.zhenghao.ecoupon.exception.InnerException;
import com.zhenghao.ecoupon.service.CouponPayApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CouponPayApplicationServiceImpl implements CouponPayApplicationService{

    @Autowired
    private CouponPayApplicationDao couponPayApplicationDao;

    @Override
    public List<CouponPayApplication> queryAllPayApplicationByConsumerId(long consumerId) {
        return couponPayApplicationDao.queryByConsumerId(consumerId);
    }

    @Override
    public List<CouponPayApplication> queryAllPayApplicationByMerchantId(long merchantId) {
        return couponPayApplicationDao.queryByMerchantId(merchantId);
    }

    @Override
    public boolean useCoupon(long consumerId, long merchantId, String couponIds)
            throws InnerException {
        try{
            int count = couponPayApplicationDao.insertCouponPayApplication(consumerId, merchantId, couponIds);

            return count == 1;
        } catch(Exception e){
            //TODO log
//            logger.error(e.getMessage(), e);
            throw new InnerException("inner error: " + e.getMessage());
        }
    }

}
