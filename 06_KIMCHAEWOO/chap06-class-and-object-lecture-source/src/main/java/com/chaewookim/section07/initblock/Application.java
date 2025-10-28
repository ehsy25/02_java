package com.chaewookim.section07.initblock;

public class Application {
    public static void main(String[] args) {

        Product product = new Product();
        System.out.println("product = " + product.getInformation());

        Product product2 = new Product("대륙폰", 600000, "샤오미");
        System.out.println(product2.getInformation());

    }
}
