package com.E.section04.uses1;

public class FireCar extends Car implements Soundable {


    @Override
    public void go() {
        System.out.println("firecar goes broom broom");
    }

    @Override
    public void stop() {
        System.out.println("firecar no broom broom");
    }

    @Override
    public void horn() {
        System.out.println("honk honk get out");
    }
}
