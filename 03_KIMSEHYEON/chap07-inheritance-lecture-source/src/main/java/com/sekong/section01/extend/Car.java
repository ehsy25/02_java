package com.sekong.section01.extend;

public class Car {
    private boolean runningStatus;

    public Car(){
        System.out.println(("Car 클래스의 기본 생성이 호출됨"));
    }
    public void run(){
        runningStatus = true;
        System.out.println("달림");
    }
    public void soundHorn(){
        if(isRunning()){
            System.out.println("빵");
        }else{
            System.out.println("주행중엔 경적 X");
        }
    }
    protected boolean isRunning(){
        return runningStatus;

    }
    public void stop(){
        runningStatus = false;
        System.out.println("멈춤");
    }
}
