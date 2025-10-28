package com.swcamp.section04.uses1;

public class FireCar extends Car implements Soundable {
    @Override
    public void horn() {
        System.out.println("Fire car HORN!!!");
    }
    @Override
    public void go() {
        System.out.println("Fire car go");
    }

    @Override
    public void stop() {
        System.out.println("Fire car stop");
    }
}
