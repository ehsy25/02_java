package com.E.section04.uses1;

public class RaceCar extends Car {
    @Override
    public void go() {
        System.out.println("Race Car goes zrooom");
    }

    @Override
    public void stop() {
        System.out.println("Race Car doesn't go zrooom");
    }
}
