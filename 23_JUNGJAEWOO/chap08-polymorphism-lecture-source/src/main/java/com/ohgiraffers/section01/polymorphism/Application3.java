package com.ohgiraffers.section01.polymorphism;

public class Application3 {
    public static void main(String[] args) {

        Application3 app = new Application3();

        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();

        app.feed(animal1);
        app.feed(animal2);

        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();

        app.feed(rabbit); // 묵시적 형변환
        app.feed(tiger);

        app.feed((Animal) rabbit); // 명시적 형변환
        app.feed((Animal) tiger);

        app.feed(new Rabbit());

    }

//    public void feed(Rabbit rabbit){}
//    public void feed(Tiger tiger){}
    public void feed(Animal animal){
        animal.eat(); //동적 바인딩
    }
}
