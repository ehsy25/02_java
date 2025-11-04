package com.lhw.section02.abstractclass;
/*추상클래스*/
public abstract class Product {

    /*추상 클래스는 field를 가질 수 있다.*/
    private int nonStaticField;
    private static int staticField;

    /*추상 클래스는 생성자를 가질 수 있다.
    * 단, 직접적으로 인스턴스 생성 불가
    * */
    public Product() {
    }

    /* 추상 클래스는 일반적인 메소드를 가질 수 있다.*/
    public void nonStaticMethod() {
        System.out.println("Product 클래스의 nonStaticMethod");
    }

    /**/
    public void staticMethod() {
        System.out.println("Prodcut 클래스의 staticMethod");
    }

    /*추상 메소드(미완성 메소드) 작성*/
    public abstract void abstMethod();
}
