package com.ohgiraffers.section08.object_array;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Car car1 = new Car("페레로로쉐",300);
        Car car2 = new Car("롤로코스터",1000);
        Car car3 = new Car("코끼리 람보",200);
        Car car4 = new Car("난부자다",700);
        Car car5 = new Car("전기포터",10);

        car1.driveMaxSpeed();
        car2.driveMaxSpeed();
        car3.driveMaxSpeed();
        car4.driveMaxSpeed();
        car5.driveMaxSpeed();

        Car[] carArr = new Car[5];
        System.out.println(Arrays.toString(carArr));
        carArr[0] = new Car("페레로로쉐",300);
        carArr[1] = new Car("롤로코스터",1000);
        carArr[2] = new Car("코끼리 람보",200);
        carArr[3] = new Car("난부자다",700);
        carArr[4] = new Car("전기포터",10);

        System.out.println(Arrays.toString(carArr));

        for(Car car : carArr){
            car.driveMaxSpeed();
        }

    }
}
