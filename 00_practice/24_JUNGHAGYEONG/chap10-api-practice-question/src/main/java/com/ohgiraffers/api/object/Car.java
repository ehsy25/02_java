package com.ohgiraffers.api.object;

import java.util.Objects;

public class Car {

    private String carName;
    private String carColor;
    private int engineCC;

    public Car(String carName, String carColor, int engineCC) {
        this.carName = carName;
        this.carColor = carColor;
        this.engineCC = engineCC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }

        Car car = (Car) o;

        if (this.carName == null) {
            if (car.carName != null) {
                return false;
            }
        }else if (!this.carName.equals(car.carName)) {
            return false;
        }

        if (this.carColor == null) {
            if (car.carColor != null) {
                return false;
            }
        } else if (!this.carColor.equals(car.carColor)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName, carColor);
    }
}
