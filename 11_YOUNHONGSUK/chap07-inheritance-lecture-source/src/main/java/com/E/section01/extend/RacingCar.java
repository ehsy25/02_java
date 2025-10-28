package com.E.section01.extend;

public class RacingCar extends Car {

    public RacingCar() {
        System.out.println("Racing Car");
    }


    @Override
    public void run() {
        super.run();
    }

    @Override
    public void soundHorn() {
        System.out.println("Race cars don't honk");
    }

    @Override
    protected boolean isRunning() {
        return super.isRunning();
    }

    @Override
    protected void stop() {
        System.out.println("race car stopped");
    }
}
