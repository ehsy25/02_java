package com.lhw.section01.polymorphism;

public class Tiger extends Animal{

    @Override
    public void eat() {
        System.out.println("호랑이가 고기를 뜯어 먹습니다.");
    }

    @Override
    public void run() {
        System.out.println("호랑이는 잘 달리지 않습니다.");
    }

    @Override
    public void cry() {
        System.out.println("호랑이가 포효를 합니다. 🐯");
    }

    public void bite() {
        System.out.println("호랑이가 물어뜯습니다. 🐯🐯🐯");
    }
}
