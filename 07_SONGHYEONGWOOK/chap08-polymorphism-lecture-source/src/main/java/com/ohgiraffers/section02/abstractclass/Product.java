package com.ohgiraffers.section02.abstractclass;

/* 추상클래스로 선언 : abstract */
/* 일반 클래스는 추상 메소드를 가질 수 없다. abstract를 지운다면 추상 메소드 부분 에러
* 일반 <-> 추상 : 추상 메소드를 가질 수 있느냐 없느냐의 차이 */
public abstract class Product {

    /* 추상 클래스는 필드를 가질 수 있다. */
    private int nonStaticField;
    private static int staticField;

    /*
    * 추상클래스는 생성자를 가질 수 있다.
    * 단, 직접적으로 인스턴스를 생성할 수는 없다.
    * */
    public Product() {
    }

    /* 추상 클래스는 일반적인 메소드를 가질 수 있다. */
    public void nonStaticMethod() {
        System.out.println("Product 클래스의 nonStaticMethod!");
    }

    public static void staticMethod() {
        System.out.println("Product 클래스의 staticMethod!");
    }

    /* 추상 메소드(미완성 메소드) 작성 */
    public abstract void abstractMethod();

}
