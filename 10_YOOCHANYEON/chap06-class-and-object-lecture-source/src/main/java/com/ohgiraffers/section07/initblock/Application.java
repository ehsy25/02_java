package com.ohgiraffers.section07.initblock;

public class Application {

    public static void main(String[] args) {

        Product product = new Product();
        System.out.println("제품 정보 : " + product.getInfo());

        Product product2 = new Product(3150, "케이틀린","필트오버");
        System.out.println("제품 정보 : " + product2.getInfo());
    }
}
