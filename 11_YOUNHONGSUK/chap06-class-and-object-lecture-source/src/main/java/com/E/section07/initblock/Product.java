package com.E.section07.initblock;

public class Product {

    /*1. JVM 기본 값
    * 2. 명시적 초기화*/

    private String name = "은하수";
    private int price = 2000000;
    private static String brand = "삼송";

    /*3. 초기화 블록
    * 인스턴스 초기화 블럭
    * */
    {
        name = "사이언";
        price = 80000000;

       // brand = "사과";
        System.out.println("instance block works");

    }

    /*static 초기화 블럭*/
    static {
        brand = "헬지";
        //name
        // price
        //non-static variables cannot be used in static block
    }

    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        this.brand = brand;
    }

    /*4. 기본 생성자*/
    public Product() {

        System.out.println("default constructor working");
    }

    public String getInfo(){

        return this.name + " " +  this.price +  " " + this.brand;

    }


}
