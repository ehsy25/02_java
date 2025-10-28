package com.lhw.section01.polymorphism;

public class Application3 {

    public static void main(String[] args) {

        Application3 application3 = new Application3();

        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();

        application3.feed(animal1);
        application3.feed(animal2);

        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();

        application3.feed(rabbit);           //묵시적 형변환
        application3.feed(tiger);

        application3.feed((Animal) rabbit); //명시적 형변환
        application3.feed((Animal) tiger);
        /*업케스팅된 내용들이다.*/

        application3.feed(new Rabbit()); // 재사용 불가.
    }

    // 오버로딩을 할 때, 상위 클래스로 오버로딩을 해준다면 편하게 해줄 수 있다.
    // 상위 클래스로 오버로딩하여 하위 클래스를 인자로 넣을 때는 업케스팅이 일어난다.
//   ger tiger) {}
    public void feed(Animal animal) {
        animal.eat();
    }



}
