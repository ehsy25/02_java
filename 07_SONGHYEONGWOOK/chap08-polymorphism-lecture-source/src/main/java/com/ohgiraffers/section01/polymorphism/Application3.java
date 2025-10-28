package com.ohgiraffers.section01.polymorphism;

public class Application3 {

    public static void main(String[] args) {
        Application3 application3 = new Application3();

        Animal animal1 = new Rabbit();          // 업캐스팅
        Animal animal2 = new Tiger();           // 업캐스팅

        application3.feed(animal1); // 동일한 타입(Animal instanceof Rabbit == true)이기 때문에 가능하다.
        application3.feed(animal2);

        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();

        application3.feed(rabbit);
        application3.feed(tiger);

        application3.feed((Animal) rabbit);
        application3.feed((Animal) tiger);

        application3.feed(new Rabbit());
    }

//    public void feed(Rabbit rabbit) {}
//    public void feed(Tiger tiger) {}

    public void feed(Animal animal) {
        animal.eat();   // 동적 바인딩
    }
}
