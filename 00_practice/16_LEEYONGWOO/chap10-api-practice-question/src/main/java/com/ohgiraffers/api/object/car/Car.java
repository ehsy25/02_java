package com.ohgiraffers.api.object.car;

import java.util.Objects;

public class Car {
    private String carname;
    private String carColor;
    private int engineCC;

    public Car(String carname, String carColor, int engineCC) {
        this.carname = carname;
        this.carColor = carColor;
        this.engineCC = engineCC;
    }

    //if carname and carColor are equal, return true, otherwise return false.

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Car car)) return false;
        return carname.equals(car.carname) && carColor.equals(car.carColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carname, carColor);
    }
}
