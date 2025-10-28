package com.ohgiraffers.api.object.car;

public class Car {
    public Car(String carName, String carColor, int engineCC) {
        this.carName = carName;
        this.carColor = carColor;
        this.engineCC = engineCC;
    }

    private String carName;
    private String carColor;
    private int engineCC;

    @Override
    public boolean equals(Object obj) { // 업캐스팅된 상태

        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        Car other = (Car) obj;

        if(this.carName == null) {
            if(other.carName != null) {
                return false;
            }
        } else if (!this.carName.equals(other.carName)) {
            return false;
        }

        if(this.carColor == null) {
            if(other.carColor != null) {
                return false;
            }
        } else if (!this.carColor.equals(other.carColor)) {
            return false;
        }

        return true;
    }

    /* 3. hashCode() 오버라이딩 */
    @Override
    public int hashCode() {
        /* 곱셈연산을 누적시켜야하기 때문에 0이 아닌 값으로 초기화 */
        int result = 1;
        /*
         * 필드마다 곱해줄 소수값을 선언 : 31
         * 31은 소수이기 때문에 연산 시 동일한 hashCode 값이 나오지 않을 확률을 증가시킨다.
         * */

        final int PRIME = 31;
        result = PRIME * result + this.carName.hashCode();
        result = PRIME * result + this.carColor.hashCode();

        return result;

    }
}
