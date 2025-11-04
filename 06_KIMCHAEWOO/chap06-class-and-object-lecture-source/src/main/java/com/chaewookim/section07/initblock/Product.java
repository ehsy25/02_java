package com.chaewookim.section07.initblock;

public class Product {

    // 1. JVM 기본값
    private String name = "은하수";
    private int price = 200000;
    private static String brand = "삼송";

    // 초기화 블록
    // 인스턴스 초기화 블록
    {
        name = "사이언";
        price = 800000;

        System.out.println("인스턴스 초기화 블럭 동작");
    }

    static {
        brand = "헬지";
        System.out.println("static 초기화 블럭 동작");
    }

    // static 초기화 블록

    // 기본 생성자
    public Product() {
        name = "갤럭시";
        System.out.println("기본 생성자 동작");
    }
    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        Product.brand = brand;
    }

    public String getInformation() {
        return this.name + " " + this.price + " " + Product.brand;
    }

}
