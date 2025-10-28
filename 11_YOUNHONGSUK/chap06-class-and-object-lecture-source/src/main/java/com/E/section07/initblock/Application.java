package com.E.section07.initblock;

public class Application {
    public static void main(String[] args)
    {
Product p = new Product();
        System.out.println(p.getInfo());



        Product p2 = new Product("name", 10, "brand");
        System.out.println(p2.getInfo());
    }

}
