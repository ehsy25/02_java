package com.E.section01.polymorphism;

public class Application3 {

    public static void main(String[] args){
        Application3 app3 = new Application3();
        Animal a1 = new Rabbit();
        Animal a2 = new Tiger();

        app3.feed(a1);
        app3.feed(a2);

    app3.feed(new Rabbit());

    }

public void feed(Rabbit r){}
public void feed(Tiger t){}
public void feed(Animal a){
    a.eat();
}

}

