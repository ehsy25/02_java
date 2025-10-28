package com.ohgiraffers.hw1.model.dto;

public class CookBook extends Book {

    //필드
    private boolean coupon;

    //생성자
    public CookBook() {}
    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    //toString
    public String toString() {
        return super.toString() + coupon;
    }

    //getter
    public boolean isCoupon() {
        return coupon;
    }

    //setter
    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }
}
