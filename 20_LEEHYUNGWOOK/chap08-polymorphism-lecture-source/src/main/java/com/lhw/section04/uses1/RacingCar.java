package com.lhw.section04.uses1;

public class RacingCar extends Car{
    /*레이싱카는 경적이 없습니다.*/

    @Override
    public void go() {
        System.out.println("레이싱카가 앞으로 갑니다.🏎️");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카가 멈춥니다.");
    }

}
