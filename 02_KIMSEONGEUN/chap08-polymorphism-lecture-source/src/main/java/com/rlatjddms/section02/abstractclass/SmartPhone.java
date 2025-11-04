package com.rlatjddms.section02.abstractclass;

/* 추상 클래스를 상속받는 경우 추상 메소드를 반드시 오버리다딩 해야한다.
* (오버라이딩 강제화)
* */
public class SmartPhone extends Product {

    @Override
    public void abstractMethod() {
        System.out.println("Product 클래스의 abstractMethod 오버라이딩한 메소드");
    }

    public void printSmartPhone() {
        System.out.println("Product 쿨래스의 printSmartPhone 메소드");
    }
}
