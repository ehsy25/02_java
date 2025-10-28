package com.ohgiraffers.hw3.model.dto;

public class ProductDTO {

    private int pld;
    private String pName;
    private int price;
    private double tax;

    public ProductDTO() {
    }

    public ProductDTO(int pld, String pName, int price, double tax) {
        this.pld = pld;
        this.pName = pName;
        this.price = price;
        this.tax = tax;
    }

    public String information() {
        return "ProductDTO{" +
                "pld=" + pld +
                ", pName='" + pName + '\'' +
                ", price=" + price +
                ", tax=" + tax +
                '}';
    }

    public int getPld() {
        return pld;
    }

    public void setPld(int pld) {
        this.pld = pld;
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
