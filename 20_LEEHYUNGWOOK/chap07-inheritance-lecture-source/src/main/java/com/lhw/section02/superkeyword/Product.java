package com.lhw.section02.superkeyword;

import java.util.Date;

public class Product {

    private String code;            // 상품코드
    private String brand;           // 제조사
    private String name;            // 상품명
    private int price;              // 가격
    private Date manufacturingDate; //제조일자

    //생성자
    public Product() {
        /*
        * 아무 클래스도 상속받지 않았는데 super()가 호출이 된다.
        * java.lang.Object 클래스의 생성자를 호출하게 된다.
        * -> 모든 클래스는 Objefct클래스의 후손이기 때문이다.
        * */
        super();
        System.out.println("Product클래스의기본생성자 호출...");
    } //기본생성자
    public Product(String code, String brand, String name, int price, Date manufacturingDate) {
        //super();
        System.out.println("Product 클래스의 매개변수에 있는 생성자 호출");
        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.manufacturingDate = manufacturingDate;
    }//생성자

    // getter
    public String getCode() {
        return code;
    }
    public String getBrand() {
        return brand;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    // setter

    public void setCode(String code) {
        this.code = code;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    // 정보출력
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
