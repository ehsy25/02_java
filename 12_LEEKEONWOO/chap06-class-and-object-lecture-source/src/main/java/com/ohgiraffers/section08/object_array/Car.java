package com.ohgiraffers.section08.object_array;

public class Car {

    private String modelName;
    private int maxspeed;

    public Car() {

    }

    public Car(String modelName, int maxspeed) {
        this.maxspeed = maxspeed;
        this.modelName = modelName;
    }

    public void driveMaxSpeed(){
        System.out.println(modelName  + "차량이 최고 시속" + maxspeed + "(km/h)으로 달립니다." );
    }
}
