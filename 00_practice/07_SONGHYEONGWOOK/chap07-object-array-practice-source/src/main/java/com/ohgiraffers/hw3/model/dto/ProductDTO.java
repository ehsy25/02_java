package com.ohgiraffers.hw3.model.dto;

import com.ohgiraffers.hw3.controller.ProductController;

public class ProductDTO {

    private int pid;
    private String pName;
    private int price;
    private double tax;
    ProductController productController = new ProductController();

    public ProductDTO() {
    }

    public ProductDTO(int pid, String pName, int price, double tax) {
        this.pid = pid;
        this.pName = pName;
        this.price = price;
        this.tax = tax;
        ProductController.count++;
    }

    public String information() {
        return  "제품 번호 : " + pid +
                ", 제품명 : '" + pName + '\'' +
                ", 제품 가격 : " + price +
                ", 제품 세금 : " + tax;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
}
