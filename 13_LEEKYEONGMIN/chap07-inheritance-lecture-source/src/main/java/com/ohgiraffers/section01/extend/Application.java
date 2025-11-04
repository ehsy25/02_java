package com.ohgiraffers.section01.extend;

public class Application {
    public static void main(String[] args) {
        /*
        상속은 IS-A 관계로 구분되는 경우에만 사용해야한다.
        삼각형은 도형이다(O)
        도형은 삼각형이다(X)
        소방차, 레이싱카 모두 자동차이다.(o)
        모든 자동차는 소방차 혹은 스쿨버스 혹은 레이싱카이다.(x)
         */
        System.out.println("FireCar");
        FireCar fireCar = new FireCar();
    }
}
