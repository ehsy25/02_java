package com.ohgiraffers.api.object.car;

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
    public boolean equals(Object obj) {

        //주소값이 같다면 true 반환한다.
        if (this == obj) {
            return true;
        }

        //null값이면 false
        if (obj == null) return false;

        //다운케스팅을 진행하여 Car에 접근할 수 있도록 만든다.
        Car downCasting = (Car) obj;

        //나머지 값이 같은지 비교하고, 전부 같다면 마지막 true를 반환한다.

        if ( this.carColor == null) {
            if ( downCasting.carColor == null) return false;
        } else if (this.carColor != downCasting.carColor) {
            return false;
        }

        if ( this.carName == null) {
            if ( downCasting.carName == null) return false;
        } else if (this.carName != downCasting.carName) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
       int result = 1;

       final int PRIME = 31;
       result = PRIME * result + this.carName.hashCode();
       result = PRIME * result + this.carColor.hashCode();
       return result;
    }
}
