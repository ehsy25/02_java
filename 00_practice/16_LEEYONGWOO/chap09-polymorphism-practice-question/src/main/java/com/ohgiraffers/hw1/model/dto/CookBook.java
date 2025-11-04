package com.ohgiraffers.hw1.model.dto;

public class CookBook extends Book {
    private boolean coupon;

    public CookBook(){
        super();
        this.coupon=false;
    }
    public CookBook(String title, String author, String publisher, boolean coupon){
        super(title,author,publisher);
        this.coupon=coupon;
    }
    public String toString(){
        return super.toString()+" / "+this.coupon;}

    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }
}
