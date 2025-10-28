package com.ohgiraffers.section04.uses1;

public class FireCar extends Car implements Soundable {
    @Override
    public void horn(){
        System.out.println("소방차가 나갑니다. 다들 비키세요~");
    }


    @Override
    public void go() {
    }

    @Override
    public void stop() {
    }
}
