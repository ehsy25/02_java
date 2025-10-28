package com.ohgiraffers.section07.initblock;

public class Application {

    public static void main(String[] args) {

        Product product = new Product();
        System.out.println("product.getInformation : " + product.getInfomation());

        Product product1 = new Product("대륙폰", 500000, "샤오미");
        System.out.println("product1.getInformation : " + product1.getInfomation());
    }
}
