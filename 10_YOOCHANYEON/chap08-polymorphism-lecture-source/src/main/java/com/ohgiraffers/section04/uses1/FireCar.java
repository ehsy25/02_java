package com.ohgiraffers.section04.uses1;

public class FireCar extends Car implements Soundable {

    @Override
    public void horn() {
        System.out.println("소방차 지나간다. 비켜라. 부앙 부앙");
    }

    @Override
    public void go() {
        System.out.println("소방차 지나간다.");
    }

    @Override
    public void stop() {
        System.out.println("소방차 멈춘다.");
    }
}
