package com.ohgiraffers.section07.initblock;

public class Application {
    public static void main(String[] args) {

        Product product = new Product();
        System.out.println(product.getInformation());

        Product product2 = new Product(name: 대륙폰, price: 500000, brand: "샤우미");
        System.out.println(product2.getInformation : " + ());
    }
}
