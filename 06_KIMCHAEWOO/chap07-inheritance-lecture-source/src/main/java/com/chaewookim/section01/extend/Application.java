package com.chaewookim.section01.extend;

public class Application {
    public static void main(String[] args) {

        // 부모 클래스
        Car car = new Car();
        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        /*
        * 상속은 is-a 관계로 구분되는 경우에만 사용해야 함
        * 삼각형은 도형이다: o
        * 도형은 삼각형이다. x
        * */
        System.out.println("======== Fire Car ========");
        FireCar fireCar = new FireCar();
        fireCar.soundHorn();
        fireCar.run();
        fireCar.soundHorn();
        fireCar.stop();
        fireCar.soundHorn();
        fireCar.sprayWater();

        System.out.println("======== Racing Car ========");
        RacingCar racingCar = new RacingCar();
        racingCar.soundHorn();
        racingCar.run();
        racingCar.soundHorn();
        racingCar.stop();
        racingCar.soundHorn();
    }
}
