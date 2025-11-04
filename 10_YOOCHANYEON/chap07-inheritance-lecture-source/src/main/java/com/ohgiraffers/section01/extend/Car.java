package com.ohgiraffers.section01.extend;

public class Car {

    private boolean runningStatus;  // 자동차의 달리는 상태값

    public Car() {
        System.out.println("Car 클래스의 기본 생성자 호출 확인");
    }

    public void run() {
        runningStatus = true;
        System.out.println("부아앙~ 💨💨💨");
    }

    public void soundHorn() {
        if(isRunning()) {
            System.out.println("❗❗❗❗❗");
        } else {
            System.out.println("🔇🔇🔇🔇🔇");
        }
    }

    protected boolean isRunning() {
        return runningStatus;
    }

    public void stop() {
        runningStatus = false;
        System.out.println("끼이이익~! 💨💨");
    }


}
