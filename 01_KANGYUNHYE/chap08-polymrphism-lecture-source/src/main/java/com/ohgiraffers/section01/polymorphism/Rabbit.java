package com.ohgiraffers.section01.polymorphism;

public class Rabbit extends Animal {

    @Override
    public void eat() {
        System.out.println("토끼가 먹은 풀은 토끼풀");
    }

    @Override
    public void run() {
        System.out.println("토끼가 깡총 깡🐰");
    }

    @Override
    public void cry() {
        System.out.println("토끼는 으앙 하고 울었어");
    }

    public void jump(){
        System.out.println("깡총 깡총 점프~~~~~~~");
    }
}
