package com.swcamp.section01.polymorphism;

public class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("Tiger bites some meats.");
    }

    @Override
    public void run() {
        System.out.println("Tiger doesn't run.");
    }

    @Override
    public void cry() {
        System.out.println("Tiger cry.");
    }

    public void bite() {
        System.out.println("Tiger bites.");
    }
}
