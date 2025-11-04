package com.E.section01.polymorphism;

public class Rabbit extends Animal {
    @Override
    public void eat() {
        System.out.println("Rabbit eats grass");
    }

    @Override
    public void run() {
        System.out.println("hippity hoppity");
    }

    @Override
    public void cry() {
        System.out.println("Rabbit cries");
    }

    public void jump(){
        System.out.println("Rabbit jumps");
    }
}