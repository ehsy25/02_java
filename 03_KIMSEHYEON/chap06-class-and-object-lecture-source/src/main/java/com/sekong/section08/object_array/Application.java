package com.sekong.section08.object_array;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Car car1 = new Car(300, "car1");
        Car car2 = new Car(200, "car2");
        Car car3 = new Car(100, "car3");

        Car[] cars = new Car[3];
        System.out.println(Arrays.toString(cars));
        cars[0] = new Car(300, "car1");
        cars[1] = new Car(200, "car2");
        cars[2] = new Car(100, "car3");
        System.out.println(Arrays.toString(cars));
        for(Car car : cars){
            car.driveMaxSpeed();
        }
        for(int i = 0; i < cars.length; i++) {
            cars[i].driveMaxSpeed();
        }


    }
}
