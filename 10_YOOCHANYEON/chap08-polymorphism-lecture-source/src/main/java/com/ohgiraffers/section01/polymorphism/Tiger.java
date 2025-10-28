package com.ohgiraffers.section01.polymorphism;

public class Tiger extends Animal {

    @Override
    public void eat() {
        System.out.println("🥩🥩🥩");
    }

    @Override
    public void run() {
        System.out.println("🐅🐅🐅~");
    }

    @Override
    public void cry() {
        System.out.println("🐯🐯🐯");
    }

    public void bite() {
        System.out.println("☠️☠️☠️");
    }
}
