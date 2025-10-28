package com.sekong.section02.superkeyword;

import java.util.Date;

import java.util.Date;

public class Product {

    private String code;
    private String brand;
    private String name;
    private double price;
    private Date manufacturingDate;


    public Product(String code, String brand, String name, double price, Date manufacturingDate) {
        super();
        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.manufacturingDate = manufacturingDate;
        System.out.println("Product클래스의 기본생성자 호출함...");
    }


    public Product(){
        /*아무 클래스도 상속받지 않았는데 super()가 호출이 된다.
         * java.lang.Object클래스의 후손이기 때문이다.
         */
        super();
        System.out.println("Product클래스의 기본생성자 호출함...");
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }


    public String getInformation() {
        return
                "code='" + code + '\'' +
                        ", brand='" + brand + '\'' +
                        ", name='" + name + '\'' +
                        ", price=" + price +
                        ", manufacturingDate=" + manufacturingDate
                ;
    }
}
