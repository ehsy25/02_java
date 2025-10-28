package com.ohgiraffers.section08.object_array;

public class Car {

    private String constructor;
    private int maxSpeed;

    public Car() {}

    public Car(int maxSpeed, String constructor) {
        this.maxSpeed = maxSpeed;
        this.constructor = constructor;
    }

    public void driveMaxSpeed() {
        System.out.println(constructor + " 차량의 최고 시속 : " + maxSpeed + "km/h");
    }
}
