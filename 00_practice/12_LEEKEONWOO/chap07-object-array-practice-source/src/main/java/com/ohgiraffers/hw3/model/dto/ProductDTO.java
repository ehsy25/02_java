package com.ohgiraffers.hw3.model.dto;

public class ProductDTO {

    private int pid;            // 제품번호
    private String pName;       // 제품명
    private int price;          // 제품 가격
    private double tax;         // 제품 세금

    public ProductDTO(int pid) {

    }

    public ProductDTO(int pid, String pName, int price, double tax) {
        this.pid = pid;
        this.pName = pName;
        this.price = price;
        this.tax = tax;
    }

    public String getInformation() {
        return
                "pid=" + pid +
                ", pName='" + pName  +
                ", price=" + price +
                ", tax=" + tax ;
    }

}
