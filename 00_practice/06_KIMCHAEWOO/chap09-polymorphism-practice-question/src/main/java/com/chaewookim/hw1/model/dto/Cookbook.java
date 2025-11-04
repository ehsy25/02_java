package com.chaewookim.hw1.model.dto;

public class Cookbook extends Book{

    private boolean coupon;

    public Cookbook() {
    }

    public Cookbook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }

}
