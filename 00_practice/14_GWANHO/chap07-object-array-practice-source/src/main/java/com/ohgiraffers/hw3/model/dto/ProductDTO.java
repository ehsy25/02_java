package com.ohgiraffers.hw3.model.dto;

import com.ohgiraffers.hw3.controller.ProductController;

public class ProductDTO {
    private int pId;
    private String pName;
    private int price;
    private double tax;

    public ProductDTO() {

    }

    public  ProductDTO(int pid, String pName, int price, double tax) {
        pId = ProductController.count++;
        this.pName = pName;
        this.price = price;
        this.tax = tax;
    }

    public String information() {
        return pId + ", " + pName + ", " + price + ", " + tax;
    }

    public int getpId() {
        return pId;
    }

}
