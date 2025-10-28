package com.sekong.hw3.model.dto;
import com.sekong.hw3.controller.*;

public class ProductDTO {
    private int pId;
    private String pName;
    private int price;
    private double tax;


    public ProductDTO() {
        ProductController.count++;
    }

    public ProductDTO(int pId, String pName, int price, double tax) {
        this.pId = pId;
        this.pName = pName;
        this.price = price;
        this.tax = tax;
        ProductController.count++;
    }
    public String information() {
        return "ProductDTO{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", price=" + price +
                ", tax=" + tax +
                '}';
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
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
