package com.ohgiraffers.hw3.model.dto;

public class ProductDTO {
    private int pId;
    private String pName;
    private int pPrice;
    private double tax;

    public ProductDTO(){}
    public ProductDTO(int pId, String pName, int pPrice, double tax) {
        this.pId = pId;
        this.pName = pName;
        this.pPrice = pPrice;
        this.tax = tax;
    }
    public String information(){
        return String.format("Product ID: %s, Product Name: %s, Product Price: %d, Tax: %.2f", pId, pName, pPrice, tax);
    }


}
