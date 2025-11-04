package com.E.section01.extend;

public class Car {

    private boolean isRunning;

    public Car() {
        super();
        System.out.println("it works");
    }

    public void run(){
        isRunning = true;
        System.out.println("it is running");
    }

    public void soundHorn(){
        if(isRunning()){
            System.out.println("honk honk");
        }else System.out.println("can't honk car not running");

    }

    protected void stop(){
        isRunning = false;
        System.out.println("it stopped");
    }


    /*protected = accessible by only same class and child classes */
    protected boolean isRunning(){
        return isRunning;
    }

}
