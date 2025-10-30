package com.ohgiraffers.section08.object_array;

public class Car {

    private String modelName;
    private int maxSpeed;

    public Car() {
    }

    public Car(int maxSpeed, String modelName) {
        this.maxSpeed = maxSpeed;
        this.modelName = modelName;
    }

    public String driveMaxSpeed() {
        System.out.println("modelName" + "차량의 최고 시속" + maxspeed + "(km/h)로 달립니다.");
    }
}
