package com.ohgiraffers.hw3.model.dto;

public class ProductDTO {

    //필드
    private int pid;
    private String pName;
    private int price;
    private double tax;

    //생성자
    public ProductDTO() {
    }
    public ProductDTO(int pid, String pName, int price, double tax) {
        this.pid = pid;
        this.pName = pName;
        this.price = price;
        this.tax = tax;
    }

    //info
    public String information() {
        return "======================\n제품조회 : \n" +
                "제품 아이디 : " + pid +
                "\n제품명 : " + pName +
                "\n제품 가격 : " + price +
                "\n세금정보 : " + tax +
                "\n======================";
    }

    //getter
    public int getPid() {
        return pid;
    }
    public String getpName() {
        return pName;
    }
    public int getPrice() {
        return price;
    }
    public double getTax() {
        return tax;
    }

    //setter
    public void setPid(int pid) {
        this.pid = pid;
    }
    public void setpName(String pName) {
        this.pName = pName;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setTax(double tax) {
        this.tax = tax;
    }
}
