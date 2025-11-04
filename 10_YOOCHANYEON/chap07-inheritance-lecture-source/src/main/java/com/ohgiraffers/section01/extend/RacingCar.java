package com.ohgiraffers.section01.extend;

public class RacingCar extends Car {

    public RacingCar() {
        System.out.println("RacingCar 클래스 기본 생성자 호출");
    }

    @Override
    public void run() {
        System.out.println("즈위이이잉~ 🔥");
    }

    @Override
    public void soundHorn() {

    }

    @Override
    public void stop() {
        System.out.println("끼이이이이이이이이익-💨💨💨");
    }
}
