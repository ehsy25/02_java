package com.E.section08.object_array;

public class Car {

    private String modelName;
    private int maxSpeed;

    public Car(){

    }

    public Car(String modelName, int maxSpeed) {
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }

    public void drivemaxSpeed(){
        System.out.println((modelName + " running at max speed" + maxSpeed + "(km/h)"));
    }

}
