package com.ohgiraffers.section07.initblock;

public class Application {

    public static void main(String[] args) {
        Product product = new Product();
        System.out.println("product.information" + product.getInformation());

        Product product1 = new Product("대륙폰",100,"샤샤샤");
        System.out.println("product1.information" + product1.getInformation());
    }

}
