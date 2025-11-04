package com.lhw.section01.extend;

public class Application {

    public static void main(String[] args) {

        /*부모클래스*/
        /*정해진 약속을 제공하는 역할을 함.*/
        Car car = new Car();

        /*상속은 IS-A 관계로 구분되는 경우에만 사용해야 한다.
        * 삼각형은 도형이다.(O)
        * 도형은 삼각형이다.(x)
        *
        * 소방차, 레이싱카는 자동차다.(O)
        * 자동차는 소방자, 레이싱카다.(x)
        * */ // IS-A 관계란

        System.out.println("============ FireCar =============");
        FireCar fireCar = new FireCar();

        fireCar.run();
        fireCar.soundHorn();
        fireCar.stop();
        fireCar.sprayWater();

        System.out.println("============ RacingCar =============");
        RacingCar racingCar = new RacingCar();
        racingCar.run();
        racingCar.soundHorn();
        racingCar.stop();
    }
}
