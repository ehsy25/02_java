package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Product {
    private String code;
    private String brand;
    private String name;
    private int price;
    private Date manufacturingDate;

    /* 기본생성자*/
    public Product(){
        /*
        * 아무 클래스도 상속받지 않았는데 super()가 호출이 된다.
        * java.lang.Object클래스의 생성자를 호출하게 된다.
        * 이유는 모든 클래스는 Object클래스의 후손이기 때문이다.
        * */
        super();
        System.out.println("Product클래스의 기본생성자 호출함");

    }

    public Product(String code, String brand, String name, int price, Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        System.out.println("Product 클래스의 기본생성자 호출함");
    }

    public String getInformation() {
        return "Product{" +
                "code='" + code + '\'' +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacturingDate=" + manufacturingDate +
                '}';
    }
}
