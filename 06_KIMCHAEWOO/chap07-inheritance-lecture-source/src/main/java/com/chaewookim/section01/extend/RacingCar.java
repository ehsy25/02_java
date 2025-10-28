package com.chaewookim.section01.extend;

public class RacingCar extends Car{

    public RacingCar() {
        System.out.println("RacingCar 기본 생성자 호출");
    }

    @Override
    public void run() {
        System.out.println("레이싱카 질주");
    }

    @Override
    public void soundHorn() {
        System.out.println("경적 안 울림");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카 멈춤");
    }
}
