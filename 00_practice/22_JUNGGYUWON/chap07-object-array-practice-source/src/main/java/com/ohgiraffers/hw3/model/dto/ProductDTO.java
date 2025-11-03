package com.ohgiraffers.hw3.model.dto;

import com.ohgiraffers.hw3.controller.ProductController;

public class ProductDTO {
    private int pId;
    private String pName;
    private int price;
    private double tax;

    public ProductDTO() {
    }

    public ProductDTO(int pId, String pName, int price, double tax) {
        this.pId = pId;
        this.pName = pName;
        this.price = price;
        this.tax = tax;
        ProductController.count++;
    }

    public String information(){
        return "제품 번호 : " + this.pId +", 제품명 : " + this.pName + ", 제품 가격 : " + this.price + ", 제품 세금 : " +  this.tax;
    }
}
