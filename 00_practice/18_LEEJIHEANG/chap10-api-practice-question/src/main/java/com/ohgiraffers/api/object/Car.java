package com.ohgiraffers.api.object;

public class Car {
    private String carName;
    private String carColor;
    private int engineCC;

    public Car(String carName, String carColor, int engineCC) {
        this.carName = carName;
        System.out.println(carName.toString());    }
}
