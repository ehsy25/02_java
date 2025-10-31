package com.chaewookim.api.object;

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
    public boolean equals(Object obj) {
        Car car = (Car) obj;

        if (this.carColor.equals(car.carColor) && this.carName.equals(car.carName)) return true;

        return false;
    }

    @Override
    public int hashCode() {
        final int HASH = 31;
        int result = 1;

        result = HASH * result + this.carName.hashCode();
        result = HASH * result + this.carColor.hashCode();

        return result;
    }
}
