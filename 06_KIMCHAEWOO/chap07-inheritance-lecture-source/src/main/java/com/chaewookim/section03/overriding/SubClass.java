package com.chaewookim.section03.overriding;

public class SubClass extends SuperClass{

    @Override
    public void method(int run) {}

//    @Override
//    public void method(String num){}
//    public int method (int num) {return 0;}
//    public void method2(int num) {}

    // private 메소드 오버라이딩 불가
//    @Override
//    private void privateMethod(){}

    // final 메소드 오버라이딩 불가
//    @Override
//    public final void finalMethod() {}
}
