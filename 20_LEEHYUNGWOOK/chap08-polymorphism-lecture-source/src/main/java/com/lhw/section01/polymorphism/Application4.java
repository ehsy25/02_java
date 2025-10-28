package com.lhw.section01.polymorphism;

public class Application4 {

    public static void main(String[] args) {

        Application4 application4 = new Application4();

        Animal randomAnimal = application4.getRandomAnimal();
        randomAnimal.cry();
    }

    // 메소드
    public Animal getRandomAnimal() {
        int random = (int) (Math.random() * 2); //0, 1
//        // 어떤 animal을 사용할지 몰라 재사용가능 animal 선언
//        Animal animal = null;
//        if (random == 0) {
//            animal =  new Rabbit();
//        } else {
//            animal = new Tiger();
//        }
        return random==0?new Rabbit():new Tiger();//삼항 연산자 사용.
    }
}
