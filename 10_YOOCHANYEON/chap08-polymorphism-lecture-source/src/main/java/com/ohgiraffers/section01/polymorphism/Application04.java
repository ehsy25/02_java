package com.ohgiraffers.section01.polymorphism;

public class Application04 {

    public static void main(String[] args) {

        Application04 app = new Application04();
        Animal randomAnimal = app.getRandomAnimal();

        randomAnimal.cry();
    }

    public Animal getRandomAnimal() {

        int random = (int)(Math.random()*2);    // 0, 1

//        Animal animal = null;
//        if(random == 0) {
//            animal = new Rabbit();
//        } else {
//            animal = new Tiger();
//        }

        return (random == 0)? new Rabbit() : new Tiger();
    }
}
