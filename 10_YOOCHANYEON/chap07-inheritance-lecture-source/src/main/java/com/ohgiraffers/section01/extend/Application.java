package com.ohgiraffers.section01.extend;

public class Application {

    public static void main(String[] args) {

        /* 부모 클래스 */
        Car car  = new Car();
        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        /*
        * 상속은 is-a 관계로 구분되는 경우에만 사용 가능
        * 삼각형은 도형(o)
        * 도형은 삼각형(x)
        *
        * 소방차, 레이싱 카는 모두 자동차(o)
        * 모든 자동차는 레이싱 카 (x)
        * */

        System.out.println("================== FireCar ==================");
        FireCar fireCar = new FireCar();
        fireCar.soundHorn();
        fireCar.run();
        fireCar.soundHorn();
        fireCar.stop();
        fireCar.soundHorn();
        fireCar.sprayWater();

        System.out.println("================== RacingCar ==================");
        RacingCar rc = new RacingCar();
        rc.soundHorn();
        rc.run();
        rc.soundHorn();
        rc.stop();
        rc.soundHorn();
    }
}
