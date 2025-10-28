package com.E.section02.abstractclasss;


//추상 클래스를 상송하면 추상 메소드를 반드시 오버라이딩 해야 한다.
public class SmartPhone extends Product {

    @Override
    public void abstMethod() {
        System.out.println("prodcut class's abstMethod overriiden");
    }

    public void printSmartPhone(){
        System.out.println("prodcut class's printSmartPhone");
    }

}
