package com.ohgiraffers.section04.users1;

public class RacingCar extends Car{

    @Override
    public void go(){
        System.out.println("레이싱카 부릉부릉");
    };
    @Override
    public void stop(){
        System.out.println("레이싱카 스탑");
    };
}
