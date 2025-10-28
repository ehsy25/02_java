package com.E.section01.polymorphism;

public class Application4 {
    public static void main(String[] args) {

Application4 a = new Application4();

        a.getRandomAnimal().cry();

    }

    public Animal getRandomAnimal() {

        Animal animal = null;

        int rand = (int) (Math.random() * 2);
//        if(rand == 0){
//            animal = new Rabbit();
//        }
//        else{
//            animal = new Tiger();
//        }
        return (rand == 0)? new Rabbit(): new Tiger();
    }
}
