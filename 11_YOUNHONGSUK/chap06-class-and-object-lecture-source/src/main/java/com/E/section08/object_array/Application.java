package com.E.section08.object_array;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
Car car = new Car("페라리", 300);
Car car2 =  new Car("람보르기니", 510);
Car car3 = new Car("RollsRoyce", 250);
Car car4 = new Car ("Bugatti", 400);
Car car5 = new Car("Porter", 500);

car.drivemaxSpeed();
car2.drivemaxSpeed();
car3.drivemaxSpeed();
car4.drivemaxSpeed();
car5.drivemaxSpeed();

Car[] cararr = new Car[5];
        System.out.println(Arrays.toString(cararr));
        cararr[0] = car;
        cararr[1] = car2;
        cararr[2] = car3;
        cararr[3] = car4;
        cararr[4] = car5;
        System.out.println(Arrays.toString(cararr));

        for(Car c : cararr){
            c.drivemaxSpeed();
        }

    }
}
