package com.ohgiraffers.section01.polymorphism;

public class Application3 {
    public static void main(String[] args) {
        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();

        Application3 application3 = new Application3();
        application3.feed(animal1);
        application3.feed(animal2);

        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();

        application3.feed(rabbit);  //묵시적 형변환
        application3.feed(tiger);

        application3.feed((Animal) rabbit); //명시적 형변환
        application3.feed((Animal) tiger);

        application3.feed(new Rabbit());

    }
//    public void feed(Rabbit rabbit){} //오버로딩 이용한 메소드
//    public void feed(Tiger tiger){}
    public void feed(Animal animal){
        animal.eat(); // 동적 바인딩
    }
}
