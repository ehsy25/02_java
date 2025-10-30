package com.ohgiraffers.section08.object_array;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        Car car1 = new Car(modelName: "페라리", maxspeed: 300);
        Car car2 = new Car(modelName: "람보르기니", maxspeed: 350);
        Car car3 = new Car(modelName: "롤스로이스", maxspeed: 250);
        Car car4 = new Car(modelName: "부가티", maxspeed: 400);
        Car car5 = new Car(modelName: "포터", maxspeed: 500);

        car1.driveMaxSpeed();
        car2.driveMaxSpeed();
        car3.driveMaxSpeed();
        car4.driveMaxSpeed();
        car5.driveMaxSpeed();

        Car[] carArray = new Car[5];
        carArray[0] = new Car("페라리", 300);
        carArray[1] = new Car("람보르기니", 350);
        carArray[2] = new Car("롤스로이스", 250);
        carArray[3] = new Car("부가티베이론", 400);
        carArray[4] = new Car("포터", 500);
        System.out.println(Arrays.toString(carArray));

        for (Car car : carArr){
        carArray[i].driveMaxSpeed();
    }


}
