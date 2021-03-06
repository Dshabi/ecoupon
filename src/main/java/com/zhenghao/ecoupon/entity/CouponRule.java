package com.zhenghao.ecoupon.entity;

import java.util.Date;

public class CouponRule {

    private long couponRuleId;

    private long merchantId;

    private int over;

    private int send;

    private int isAccumulation;

    private int quote;

    private int totalAmount;

    private int sentAmount;

    private Date validStartTime;

    private Date validEndTime;

    private Date createTime;

    private int status;

    public long getCouponRuleId() {
        return couponRuleId;
    }

    public void setCouponRuleId(long couponRuleId) {
        this.couponRuleId = couponRuleId;
    }

    public long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(long merchantId) {
        this.merchantId = merchantId;
    }

    public int getOver() {
        return over;
    }

    public void setOver(int over) {
        this.over = over;
    }

    public int getSend() {
        return send;
    }

    public void setSend(int send) {
        this.send = send;
    }

    public int getIsAccumulation() {
        return isAccumulation;
    }

    public void setIsAccumulation(int isAccumulation) {
        this.isAccumulation = isAccumulation;
    }

    public int getQuote() {
        return quote;
    }

    public void setQuote(int quote) {
        this.quote = quote;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getSentAmount() {
        return sentAmount;
    }

    public void setSentAmount(int sentAmount) {
        this.sentAmount = sentAmount;
    }

    public Date getValidStartTime() {
        return validStartTime;
    }

    public void setValidStartTime(Date validStartTime) {
        this.validStartTime = validStartTime;
    }

    public Date getValidEndTime() {
        return validEndTime;
    }

    public void setValidEndTime(Date validEndTime) {
        this.validEndTime = validEndTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CouponRule{" +
                "couponRuleId=" + couponRuleId +
                ", merchantId=" + merchantId +
                ", over=" + over +
                ", send=" + send +
                ", isAccumulation=" + isAccumulation +
                ", quote=" + quote +
                ", totalAmount=" + totalAmount +
                ", sentAmount=" + sentAmount +
                ", validStartTime=" + validStartTime +
                ", validEndTime=" + validEndTime +
                ", createTime=" + createTime +
                ", status=" + status +
                '}';
    }
}
