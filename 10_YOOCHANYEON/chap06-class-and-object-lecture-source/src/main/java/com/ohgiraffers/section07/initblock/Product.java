package com.ohgiraffers.section07.initblock;

public class Product {
    /* 1. JVM 기본값 */
    /* 2. 명시적 초기화 */
    private int price = 2000000;
    private static String brand = "샘송";
    private String name = "은하수";

    /* 3. 초기화 블록 */
    /* static 초기화 블럭 */
    static {
        brand = "녹서스";

//        name = "르블랑";
//        price = 1350;
        System.out.println("static 초기화 블럭 작동 확인");
    }

    /* 인스턴스 초기화 블럭 */
    {
        name = "사이온";
        price = 450;

        brand = "데마시아";
        System.out.println("인스턴스 초기화 블럭 작동 확인");
    }

    /* 4. 기본 생성자 */
    public  Product() {
        System.out.println("기본 생성자 작동 확인");
    }

    public Product(int price, String name, String brand) {
        this.price = price;
        this.name = name;
        Product.brand = brand;
        System.out.println("매개 변수 생성자 작동 확인");
    }

    public String getInfo() {
        return this.name + " " + this.price + " " + Product.brand;
    }

}
