package com.ohgiraffers.section01.polymorphism;

public class Application4 {
    public static void main(String[] args) {

        Application4 app = new Application4();
        Animal randomanimal=app.getRandomAnimal();
        randomanimal.cry();
    }

    public Animal getRandomAnimal(){
        int random =(int)(Math.random()*2); //0,1

//        Animal animal=null;
//        if(random==0){
//            animal=new Rabbit();
//        }else{
//            animal=new Tiger();
//        }

        return random==0?new Rabbit():new Tiger();
    }
}
