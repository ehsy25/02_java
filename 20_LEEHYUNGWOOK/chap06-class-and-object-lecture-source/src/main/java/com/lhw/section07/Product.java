package com.lhw.section07;

public class Product {
    /*JVM 기본값*/
//    private String name;
//    private int price;
//    private static String brand;

    /*명시적 초기화*/
    private String name = "Galaxy";
    private int price = 20000000;
    private static String brand = "Semsung";

    /* 3. 초기화 블럭*/
    /* 인스턴스 초기화 블럭*/
    {
        name = "사이언";
        price = 800000;
        //brand = "사과";
        System.out.println("인스턴스 초기화 블럭 동작");
    }

    static {
        brand = "헬지";
        //name = "범블비";
        System.out.println("Static 초기화 블러 동작");
    }

    /* 4. 생성자*/
    public Product() {
        System.out.println("기본생성자");
    }
    // Statifc변수는 static에서 가져와함!
    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        Product.brand = brand;
    }

    public String getInfo(){
        return this.name + " " + this.price + " " + Product.brand;
    }
}
