package com.E.section03.interfaceimplements;

public class Product extends Object implements InterProduct {

/*클래스에서 인터페이스를 상속받을 때에는 implements키워드를 사용한다
* 또한 인터페이스는 여러 개를 상속 받을 수 있다
* extends로 다른 클래스를 상속 받는 경우에는 추가로 인터페이스도 상속이 가능하다
* 하지만 extends 다음에 implements가 와야한다*/

    @Override
    public void nonStaticMethod() {
        System.out.println("called the product class's asbtMethod");
    }

    /*you can't override static methods*/

    /*default methods can only be written inside interfaces*/
    @Override
    public void defaultMethod() {
        System.out.println("called the product class's default Method");
    }

    @Override
    public void testMethod() {
    }
}