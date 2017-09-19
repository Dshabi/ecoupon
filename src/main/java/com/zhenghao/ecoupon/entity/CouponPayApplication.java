package com.zhenghao.ecoupon.entity;

import java.util.Date;

public class CouponPayApplication {

    private long couponPayApplicationId;

    private long consumerId;

    private long merchantId;

    private String couponIds;

    private Date consumeTime;

    private int status;

    public long getCouponPayApplicationId() {
        return couponPayApplicationId;
    }

    public void setCouponPayApplicationId(long couponPayApplicationId) {
        this.couponPayApplicationId = couponPayApplicationId;
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

    public String getCouponIds() {
        return couponIds;
    }

    public void setCouponIds(String couponIds) {
        this.couponIds = couponIds;
    }

    public Date getConsumeTime() {
        return consumeTime;
    }

    public void setConsumeTime(Date consumeTime) {
        this.consumeTime = consumeTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CouponPayApplication{" +
                "couponPayApplicationId=" + couponPayApplicationId +
                ", consumerId=" + consumerId +
                ", merchantId=" + merchantId +
                ", couponIds='" + couponIds + '\'' +
                ", consumeTime=" + consumeTime +
                ", status=" + status +
                '}';
    }
}
