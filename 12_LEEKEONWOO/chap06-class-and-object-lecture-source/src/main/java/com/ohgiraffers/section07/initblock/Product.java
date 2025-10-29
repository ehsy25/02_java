package com.ohgiraffers.section07.initblock;

public class Product {

    /* JVM 기본값 */
//    private String name ;
//    private int price ;
//    private static String brand ;
    /* 2. 명시적 초기화 */
    private String name = "은하수";
    private int price = 2000000;
    private static String brand = "삼송";

    /* 3. 초기화 블록 */
    /* 인스턴스 초기화 블럭 */
    {
        name = "사이언";
        price = 800000;

//        brand = "사과";
        System.out.println("인스턴스 초기화 블럭 동작함");
    }

    /* static 초기화 블럭 (정적)*/
    static {
        brand = "헬지";

//        name = "아이뽕";     // static이 아니기 때문에 사용 불가
//        price = 2500000;
        System.out.println("static 초기화 블럭 동작함");
    }

    /* 4. 기본 생성자 */
    public Product() {
        System.out.println("기본 생성자 동작함");
    }

    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        Product.brand = brand;
        System.out.println("매개변수 생성자 동작함");
    }

    public String getInformation() {
        return this.name + " " + this.price + " " + this.brand;
    }


}
