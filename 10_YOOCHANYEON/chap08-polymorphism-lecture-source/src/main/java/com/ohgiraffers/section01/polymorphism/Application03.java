package com.ohgiraffers.section01.polymorphism;

public class Application03 {

    public static void main(String[] args) {
        Application03 app = new Application03();

        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();

        app.feed(animal1);  // 동일한 타입이기 때문에 가능
        app.feed(animal2);

        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();

        app.feed(rabbit);           // 묵시적 형 변환
        app.feed(tiger);

        app.feed((Animal)rabbit);   // 명시적 형 변환
        app.feed((Animal)tiger);

        app.feed(new Rabbit());
    }

//    public void feed(Rabbit rabbit) {}
//    public void feed(Tiger tiger) {}      -> 다형성을 적용하지 않고 메소드 생성시 클래스 별로 만들어주어야 함

    public void feed(Animal animal) {
        animal.eat();   // 동적 바인딩
    }
}
