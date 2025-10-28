package com.ogiraffers.section07.initblock;

public class Application {
    public static void main(String[] args) {
        Product p1 = new Product();
        System.out.println("product.information : "+p1.getInformation());

        Product product2=new Product("대륙폰",500000,"샤우미");
        System.out.println("product2.information : "+product2.getInformation());
    }
}
