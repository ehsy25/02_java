package com.swcamp.section04.uses1;

public class RacingCar extends Car {
    @Override
    public void go() {
        System.out.println("Racing car go");
    }

    @Override
    public void stop() {
        System.out.println("Racing car stop");
    }
}
