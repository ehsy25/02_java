package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Product {
    private String code;
    private String brand;
    private String name;
    private int price;
    private Date manufactureDate;

    /*기본생성자*/

    public Product() {
        /*
        * 아무 클래스도 상속받지 않았는데 super() 호출이 된다.
        * java.lang.Object클래스의 생성자를 호출하게 된다.
        * 이유는 모든 클래스는 Object클래스의 후손이기 때문이다.
         */
        super();
        System.out.println("Product 클래스의 기본 생성자 호출함...");
    }

/*setter와 getter는 부모 필드의 메소드에 대해서는 자신의 것처럼 사용가능하기 떄문에

따로 작성할 필요없이 부모클래스에 작성한것을 사용할 수 있다.
따라서 자식 클래스에 추가된 필드에 대해서만 setter/ getter를 작성한다.*/

    public Product(String code, String brand, String name, int price, Date manufactureDate) {
        super();
        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.manufactureDate = manufactureDate;
        System.out.println("Product 클래스의 매개변수 있는 생성자 호출...");
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getInformation() {
        return "Product{" +
                "code='" + code + '\'' +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufactureDate=" + manufactureDate +
                '}';
    }

}
