package com.swcamp.section02.abstractclass;

public class SmartPhone extends Product {

    @Override       // 이 @어노테이션을 안붙여도 오류는 안남. 그러나 가독성을 위해!
    public void abstMethod() {
        System.out.println("Product 클래스의 abstMethod 오버라이딩한 메소드");
    }
    public void printSmartPhone() {
        System.out.println("SmartPhone 클래스의 printSmartPhone 메소드");
    }
}
