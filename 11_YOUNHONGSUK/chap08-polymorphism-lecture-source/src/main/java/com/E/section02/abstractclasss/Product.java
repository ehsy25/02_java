package com.E.section02.abstractclasss;

public abstract class Product {

    //추상 클래스는 필드를 가질 수 있다
    private int nonStaticField;
    private static int staticField;


    //추상클래스는 생성자를 가질 수 있지만, 직접적으로 생성할 수는 없다
    // new Product() 가 불가능 하다는 의미
    public Product() {

    }

    /*추상 클래스는 일반적인 메소드를 가질 수 있다*/
    public void nonStaticMethod() {
        System.out.println("nonStaticMethod");
    }

    public static void StaticMethod() {
        System.out.println("StaticMethod");
    }

    //추상 메소드(미완성 메소드) 작성
    public abstract void abstMethod();

}
