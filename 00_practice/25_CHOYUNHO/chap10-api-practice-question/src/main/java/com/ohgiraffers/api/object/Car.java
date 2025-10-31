package com.ohgiraffers.api.object;

public class Car {
    private String carName;
    private String carColor;
    private int engineCC;

    public Car() {
    }

    public Car(String carName, String carColor, int engineCC) {
        this.carName = carName;
        this.carColor = carColor;
        this.engineCC = engineCC;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        Car c = (Car) obj;
        if(this.carName != c.carName)
            return false;

        if(this.carColor != c.carColor)
            return false;


        return true;
    }

    @Override
    public int hashCode() {
        int result =1;
        final int PRIME = 31;
        result = result * PRIME + carName.hashCode();
        result = result * PRIME + carColor.hashCode();
        return result;
    }
}
