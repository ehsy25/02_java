package com.sekong.section07.initblock;

public class Application {
    public static void main(String[] args) {
        Product product = new Product();
        System.out.println(product.getInformation());
        Product product2 = new Product("하이",2099,"당");
        System.out.println(product2.getInformation());
    }
}
