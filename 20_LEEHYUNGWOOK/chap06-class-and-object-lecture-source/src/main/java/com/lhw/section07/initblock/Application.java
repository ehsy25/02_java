package com.lhw.section07.initblock;

import com.lhw.section07.Product;

import java.sql.SQLOutput;

public class Application {

    public static void main(String[] args) {

        Product product = new Product();
        System.out.println("product = " + product.getInfo());

        Product product2 = new Product("대륙폰", 1, "생숭");
        System.out.println("product2 = " + product2.getInfo());
    }
}
