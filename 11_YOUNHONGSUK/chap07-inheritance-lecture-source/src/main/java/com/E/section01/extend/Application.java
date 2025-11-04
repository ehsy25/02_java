package com.E.section01.extend;

public class Application {
    public static void main(String[] args){

        /*parent class*/
        Car car = new Car();

        /*상속은 is-a 관계로 구분되는 경우에만 사용해야한다
        * 삼각형은 도형이다
        * 하지만 도형은 삼각형이 아니다
        *
        * 소방차, 레이싱카 모두 자동차이다
        * 하지만 모든 자동차는 소방차, 레이싱카가 아니다*/

        System.out.println(" ========== firecar ");
        FireCar fC = new FireCar();
        car.run();
        car.soundHorn();

        fC.run();
        fC.soundHorn();

        Car fC2 = new FireCar();

    }
}
