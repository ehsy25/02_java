package com.ohgiraffers.section01.polymorphism;

public class Tiger extends Animal{

    @Override
    public void eat() {
        System.out.println("호랑이가 고기를 뜯어 먹습니다.");
    }

    @Override
    public void run() {
        System.out.println("호랑이는 동물의 왕. 걷지 아나요");
    }

    @Override
    public void cry() {
        System.out.println("호랑이가 어흥~~~~~ 떡 하나 주면 안잡아먹을껄");
    }

    public void bite(){
        System.out.println("호랑이가 앙하고 물었다.");
    }
}
