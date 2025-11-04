package com.chaewookim.hw3.model.dto;

public class ProductDTO {

    private int pid;
    private String pName;
    private int price;
    private double tax;

    public ProductDTO(int pid) {

    }

    public ProductDTO(int pid, String pName, int price, double tax) {
        this.pid = pid;
        this.pName = pName;
        this.price = price;
        this.tax = tax;
    }

    public String information() {
        return "Product{" +
                "pid=" + pid +
                ", pName='" + pName + '\'' +
                ", price=" + price +
                ", tax=" + tax +
                '}';
    }
}
