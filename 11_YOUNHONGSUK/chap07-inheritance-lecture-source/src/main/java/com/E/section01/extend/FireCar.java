package com.E.section01.extend;

public class FireCar extends Car {

    /*생성자를 제외하고 필드, 메소드등을 상속 받는다*/

    public FireCar(){

        /*자식의 모든 생성자 맨 첫 줄에 super()가 온다
        * 부모의 기본생성자를 호출하는 구문으로 명시적 or 묵시적으로 사용가능*/
        super();
        System.out.println("FireCar 기본 생성자 호출");

    }

    /*checks for overriding condition and gives a compile error if the condition is not met*/

    @Override
    public void soundHorn(){
        if(isRunning()){
            System.out.println("HONK HONK MOTHAFLIPPA");
        }
        else System.out.println("move or die");
    }

    /*inheritance means the child class expands upon the parent class,
    * so children can have their own methods*/

    public void sprayWater(){
        System.out.println("spraying water");
    }

}
