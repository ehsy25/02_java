package com.sekong.section08.object_array;

public class Car {

    private String modeName;
    private int maxSpeed;

    public Car(){

    }
    public Car(int maxSpeed, String modeName) {
        this.maxSpeed = maxSpeed;
        this.modeName = modeName;
    }
    public void driveMaxSpeed(){
        System.out.println(modeName + " 차량이 최고시속 "+maxSpeed+"(km/h)으로 달립니다.");
    }
}
