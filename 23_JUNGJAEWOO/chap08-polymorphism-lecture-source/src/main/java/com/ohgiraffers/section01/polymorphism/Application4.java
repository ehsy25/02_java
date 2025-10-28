package com.ohgiraffers.section01.polymorphism;

public class Application4 {
    public static void main(String[] args) {

        Application4 app = new Application4();
        Animal randomAnimal = app.getRandomAnimal();
        randomAnimal.cry();
    }

    public Animal getRandomAnimal(){
        int random = (int)(Math.random() * 2); // 0, 1
        return random == 0 ? new Rabbit() : new Tiger();
    }
}
