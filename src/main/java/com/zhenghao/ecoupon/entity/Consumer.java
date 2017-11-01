package com.zhenghao.ecoupon.entity;

public class Consumer {

    private long consumerId;

    private long account;

    private String password;

    private String name;

    public long getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(long consumerId) {
        this.consumerId = consumerId;
    }

    public long getAccount() {
        return account;
    }

    public void setAccount(long account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "consumerId=" + consumerId +
                ", account=" + account +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
