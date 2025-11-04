package com.chaewookim.section01.extend;

public class Car {

    private boolean runningStatus;  // 자동차의 달리는 상태값

    public Car() {
        System.out.println("Car 클래스의 기본생성자 호출됨");
    }

    public void run() {
        runningStatus = true;
        System.out.println("자동차 달림");
    }

    public void soundHorn() {
        if (isRunning()) {
            System.out.println("👋👋👋👋");
        } else {
            System.out.println("주행중 아님");
        }
    }

    protected boolean isRunning() {
        return runningStatus;
    }

    public void stop() {
        runningStatus = false;
        System.out.println("자동차 멈춤");
    }
}
