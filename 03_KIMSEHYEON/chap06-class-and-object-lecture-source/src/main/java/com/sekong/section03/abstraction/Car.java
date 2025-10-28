package com.sekong.section03.abstraction;

public class Car {
    private boolean isOn = false; // 시작은 시동이 꺼져 있는 상태
    private int speed;

    // 시동을 걸어라. 앞으로 가라. 멈춰라. 시동을 꺼라

    public void startUp(){
        if(this.isOn){
            System.out.println("이미 시동이 걸려 있습니다.");
        }
        else {
            this.isOn = true;
            System.out.println("시동을 걸었습니다.");
        }
    }
    public void go(){
        if(isOn){
            this.speed += 10;
            System.out.println("차가 앞으로 움직입니다. 현재 속도는 " + speed);
        }else {
            System.out.println("시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요.");
        }

    }
    public void stop(){
        if(isOn){
            if(speed > 0){
                speed = 0;
                System.out.println("급 브레이크를 밟았습니다. 차를 멈춥니다.");
            }else {
                System.out.println("차가 이미 멈춰있습니다.");
            }
        }else {
            System.out.println("시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요.");
        }

    }
    public void turnOff(){
        if(isOn){
            if(speed > 0){
                System.out.println("달리는 상태에서 시동을 끌 수 없습니다. 차를 먼저 멈춰주세요");
            }
            else {
                System.out.println("시동을 끕니다. 다시 운행하려면 시동을 켜 주세요.");
                isOn = false;
            }
        }else{
            System.out.println("이미 시동이 꺼져 있는 상태입니다. 시동을 먼저 켜주세요");
        }
    }

}
