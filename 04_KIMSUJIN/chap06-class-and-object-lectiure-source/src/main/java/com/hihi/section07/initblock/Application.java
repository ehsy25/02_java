package com.hihi.section07.initblock;

public class Application {
    public static void main(String[] args) {

        Product product = new Product();
        System.out.println("product.information : " + product.getInformation());


        Product product2 = new Product("대륙폰",50000,"샤오미" );
        System.out.println("product2.information : " + product2.getInformation());
    }
}
