package com.ohgiraffers.section08.object_array;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        Car car1 = new Car(320, "페라리");
        Car car2 = new Car(340, "맥라렌");
        Car car3 = new Car(330, "메르세데스");
        Car car4 = new Car(325, "레드불");
        Car car5 = new Car(330, "아우디");

        car1.driveMaxSpeed();
        car2.driveMaxSpeed();
        car3.driveMaxSpeed();
        car4.driveMaxSpeed();
        car5.driveMaxSpeed();

        Car[] carArr = new Car[5];
        System.out.println(Arrays.toString(carArr));
        carArr[0] = new Car(320, "페라리");
        carArr[1] = new Car(340, "맥라렌");
        carArr[2] = new Car(330, "메르세데스");
        carArr[3] = new Car(325, "레드불");
        carArr[4] = new Car(330, "아우디");;
        System.out.println(Arrays.toString(carArr));

        for(Car car : carArr) {
            car.driveMaxSpeed();
        }

    }
}
