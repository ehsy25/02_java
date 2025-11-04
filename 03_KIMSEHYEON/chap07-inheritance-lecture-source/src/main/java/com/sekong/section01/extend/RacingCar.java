package com.sekong.section01.extend;

import org.w3c.dom.ls.LSOutput;

public class RacingCar extends Car{
    public RacingCar() {
        System.out.println("RacingCar 클래스 기본생성자 호출됨");
    }

    @Override
    public void run() {
        System.out.println("레이싱카 질주");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카 경적");
    }

    @Override
    public void soundHorn() {
        System.out.println("레이싱카 멈춤");
    }
}
