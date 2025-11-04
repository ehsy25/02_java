package com.swcamp.section01.extend;

public class RacingCar extends Car {

    public RacingCar() {
        System.out.println("RacingCar 클래스 기본생성자 호출됨..");
    }

    @Override
    public void run() {
        super.run();
        System.out.println("I'M RACING!!");
    }

    @Override
    public void soundHorn() {
        super.soundHorn();
        System.out.println("Shh.. racing car doesn't horn.");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("We have to retire...");
    }
}
