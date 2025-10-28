package com.ohgiraffers.section04.users1;

public class FireCar extends Car implements Soundable{

    @Override
    public void horn(){
        System.out.println("소방차 나간다 비켜라");
    }
    @Override
    public void go(){
        System.out.println("소방차 삐용삐용");
    };
    @Override
    public void stop(){
        System.out.println("소방차 그탑");
    };

}
