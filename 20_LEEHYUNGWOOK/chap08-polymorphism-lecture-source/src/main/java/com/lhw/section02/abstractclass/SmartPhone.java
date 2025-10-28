package com.lhw.section02.abstractclass;

/*
* 추상 클래스를 상속받는 경우 추상 메소드를 반드시 오버라이딩 해야한다.
* */
public class SmartPhone extends Product {


    @Override
    public void abstMethod() {
        System.out.println("Product abstMethod 의 오버라이딩 메소드");
    }

    public void printSmartPhone() {
        System.out.println("SmartPhone 클래스의 printSmartPhone ");
    }
}
