package com.zhenghao.ecoupon.entity;

import java.util.Date;

public class CouponApplication {

    private long couponApplicationId;

    private long consumerId;

    private long merchantId;

    private long ruleId;

    private int couponNumber;

    private Date applicationTime;

    private int status;

    public long getCouponApplicationId() {
        return couponApplicationId;
    }

    public void setCouponApplicationId(long couponApplicationId) {
        this.couponApplicationId = couponApplicationId;
    }

    public long getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(long consumerId) {
        this.consumerId = consumerId;
    }

    public long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(long merchantId) {
        this.merchantId = merchantId;
    }

    public long getRuleId() {
        return ruleId;
    }

    public void setRuleId(long ruleId) {
        this.ruleId = ruleId;
    }

    public int getCouponNumber() {
        return couponNumber;
    }

    public void setCouponNumber(int couponNumber) {
        this.couponNumber = couponNumber;
    }

    public Date getApplicationTime() {
        return applicationTime;
    }

    public void setApplicationTime(Date applicationTime) {
        this.applicationTime = applicationTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CouponApplication{" +
                "couponApplicationId=" + couponApplicationId +
                ", consumerId=" + consumerId +
                ", merchantId=" + merchantId +
                ", ruleId=" + ruleId +
                ", couponNumber=" + couponNumber +
                ", applicationTime=" + applicationTime +
                ", status=" + status +
                '}';
    }
}
