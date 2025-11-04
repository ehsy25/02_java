package com.E.section01.polymorphism;

public class Tiger extends Animal{



    @Override
    public void eat() {
        System.out.println("tiger eats meat");
    }

    @Override
    public void run() {
        System.out.println("tiger doesn't run");
    }

    @Override
    public void cry() {
        System.out.println("tiger roars");
    }

    public void bite(){
        System.out.println("tiger bites");
    }

}
