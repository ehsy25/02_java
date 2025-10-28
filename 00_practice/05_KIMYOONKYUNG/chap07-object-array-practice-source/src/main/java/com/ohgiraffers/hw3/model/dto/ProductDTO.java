package com.ohgiraffers.hw3.model.dto;

public class ProductDTO {
    public int pld;
    public String pName;
    public int price;
    public double tax;

    public ProductDTO() {}

    public ProductDTO(int pld, String pName, int price, double tax) {
        this.pld = pld;
        this.pName = pName;
        this.price = price;
        this.tax = tax;
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

    // 정보 출력 메서드
    public String information() {
        // 실제 가격 (가격 + 가격 * 세금) 계산
        double actualPrice = price + (price * tax);

        return "제품번호: " + pld +
                " | 제품명: " + pName +
                " | 가격: " + price + "원" +
                " | 세금: " + String.format("%.1f", tax * 100) + "%" +
                " | (실제 가격: " + String.format("%,.0f", actualPrice) + "원)";
    }
}