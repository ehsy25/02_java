package com.hihi.section02.abstractclass;

/*추상 클래스를 상속받는 경우 추상 메소드를 반드시 오버라이딩 해야한다.
* (오버라이딩 강제화)*/

public class SmartPhone extends Product{

    @Override       //annotation안써도 동작은 하는데 가독성을 위해서 쓰는게 좋음
    public void abstMethod() {
        System.out.println("Product클래스의 abstMethod 오버라이딩한 메소드");
    }

    public void printSmartPhone(){
        System.out.println("SmartPhone 클래스의printSmartPhone");
    }
}
