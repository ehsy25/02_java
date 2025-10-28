package com.chaewookim.section08.object_array;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        Car[] carArr = new Car[5];
        System.out.println(Arrays.toString(carArr));
        carArr[0] = new Car(300, "페라리");
        carArr[1] = new Car(200, "람보르기니");
        carArr[2] = new Car(500, "포터");
        carArr[3] = new Car(600, "부가티");
        carArr[4] = new Car(700, "맥라렌");
        System.out.println(Arrays.toString(carArr));

        for (Car i : carArr) {
            i.driveMaxSpeed();
        }

    }
}
