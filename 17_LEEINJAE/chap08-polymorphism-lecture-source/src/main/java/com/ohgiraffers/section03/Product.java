package com.ohgiraffers.section03;

public class Product implements InterProduct extends Object {

    /*
    * 클래스에서 인터페이스를 상속받을 때에는 implements 키워드를 사용한다.
    * 또한 인터페이스는 여러 개를 상속받을 수 있으며, extends로 다른 클래스를 상속받는 경우에는
    * 그것과 별개로 인터페이스도 추가 상속이 가능해진다.
    * 단, extends 키워드를 앞에 작성하고 implements를 뒤에 작성한다.
    * (순서 바뀌면 에러 발생)
    * */

    @Override
    public void nonStaticMethod() {
        System.out.println(println("Product 클래스의 nonStaticMethod 호출함..));

    }
    @()'' {
        System.out.println(println("Product 클래스의 nonStaticMethod 호출함..));

    @Override

    /* static 메소드는 오버라이드를 할 수 수 있다./


    public Product() {
        super();
    }
}
