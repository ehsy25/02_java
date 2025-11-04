package com.ogiraffers.section01.extend;

public class Appplication {
    public static void main(String[] args) {

        /*부모클래스*/
        Car car = new Car();

        /*
        상속은 IS-A관계로 구분되는 경우에만 사용해야한다.
        삼각형은 도형이다(O)
        도형은 삼각형이다(X)

        소방차, 레이싱카 모두 자동차이다.(O)
        자동차는 소방차,레이싱카 이다.(X)
         */
        System.out.println("================FireCar============");
        FireCar fireCar=new FireCar();
        fireCar.soundHorn();
        fireCar.run();
        fireCar.stop();


    }
}

