package com.zhenghao.ecoupon.dto;

import java.util.Date;

public class PromotionActivity {

    private long couponRuleId;

    private long merchantId;

    private String name;

    private String address;

    private int over;

    private int send;

    private int isAccumulation;

    private int quote;

    private int totalAmount;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
        return "PromotionActivity{" +
                "couponRuleId=" + couponRuleId +
                ", merchantId=" + merchantId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", over=" + over +
                ", send=" + send +
                ", isAccumulation=" + isAccumulation +
                ", quote=" + quote +
                ", totalAmount=" + totalAmount +
                ", validStartTime=" + validStartTime +
                ", validEndTime=" + validEndTime +
                ", createTime=" + createTime +
                ", status=" + status +
                '}';
    }
}
