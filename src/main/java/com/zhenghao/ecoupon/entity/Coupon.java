package com.zhenghao.ecoupon.entity;

public class Coupon {

    private long couponId;

    private long ruleId;

    private long ownerId;

    private int status;

    private CouponRule couponRule;

    public long getCouponId() {
        return couponId;
    }

    public void setCouponId(long couponId) {
        this.couponId = couponId;
    }

    public long getRuleId() {
        return ruleId;
    }

    public void setRuleId(long ruleId) {
        this.ruleId = ruleId;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setCouponRule(CouponRule couponRule) {
        this.couponRule = couponRule;
    }

    @Override
    public String toString() {
        return "Coupon{" +
                "couponId=" + couponId +
                ", ruleId=" + ruleId +
                ", ownerId=" + ownerId +
                ", status=" + status +
                ", couponRule=" + couponRule +
                '}';
    }
}
