package com.swcamp.section01.polymorphism;

public class Rabbit extends Animal{
    @Override
    public void eat() {
        System.out.println("Rabbit eats some grass.");
    }

    @Override
    public void run() {
        System.out.println("Rabbit runs.");
    }

    @Override
    public void cry() {
        System.out.println("Rabbit cry.");
    }

    public void jump() {
        System.out.println("Rabbit jumps.");
    }
}
