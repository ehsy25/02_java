package com.chaewookim.section08.object_array;

public class Car {

    private String modelName;
    private int maxSpeed;

    public Car() {}

    public Car(int maxSpeed, String modelName) {
        this.maxSpeed = maxSpeed;
        this.modelName = modelName;
    }

    public void driveMaxSpeed() {
        System.out.println(modelName + "차량이 최고 시속 + " + maxSpeed + "km/h로 달립니다.");
    }
}
