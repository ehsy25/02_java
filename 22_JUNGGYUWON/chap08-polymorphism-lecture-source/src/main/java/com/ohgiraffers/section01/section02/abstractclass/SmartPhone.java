package com.ohgiraffers.section01.section02.abstractclass;

public class SmartPhone extends Product{

    @Override
    public void abstractMethod() {
        System.out.println("Product 클래스의 abstract method 오버라이딩 한 메소드");
    }

    public void printSmartPhone(){
        System.out.println("SmartPhone 클래스의 printSmartPhone 메소드");
    }
}
