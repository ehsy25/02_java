package com.swcamp.section01.polymorphism;

public class Application4 {

    public static void main(String[] args) {
        Application4 application4 = new Application4();
        Animal randomAnimal = application4.getRandomAnimal();
        randomAnimal.cry();     // 실행할 때마다 랜덤으로 tiger/rabbit

    }

    public Animal getRandomAnimal() {
        int random = (int) (Math.random() * 2); // 0, 1
        return (random == 0) ? new Rabbit() : new Tiger();
    }
}
