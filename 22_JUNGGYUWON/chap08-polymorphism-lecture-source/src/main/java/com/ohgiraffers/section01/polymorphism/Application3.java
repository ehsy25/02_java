package com.ohgiraffers.section01.polymorphism;

public class Application3 {
    public static void main(String[] args) {
        Application3 application3 = new Application3();

        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();

        application3.feed(animal1);
        application3.feed(animal2);

        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();

        application3.feed(rabbit);
        application3.feed(tiger);
    }

//    public void feed(Rabbit r){
//
//    }
//
//    public void feed(Tiger t){
//
//    }

    public void feed(Animal a){
        a.eat(); // 동적 바인딩
    }
}
