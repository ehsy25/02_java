//package com.ohgiraffers.section01.extend;
//
//public class FireCar extends Car {
//
//    /*
//    * Car클래스의 모든 멤버(필드, 메소드)를 상속 받을 수 있다.
//    * 단, 생성자는 상속 받지 못한다.
//     */
//
//    public FireCar() {
//        /*
//        * 모든 생성자 맨 첫 줄에 super()를 컴파일러가 자동으로 추가한다.
//        * 부모의 기본 생성자를 호출하는 구문으로 명시적 or 묵시적으로 사용가능하다.
//         */
//        super();
//        System.out.println("FireCar클래스 기본 생성자 호출");
//    }
//
//    /*
//    * soundHorn 메소드 재작성 : overriding
//    * @Override 어노테이션 : 오버라이딩 성립요건을 체크하여 성립되지 않는 경우 컴파일 에러 발생
//     */
//
//    @Override
//    public void soundHorn {
//        // private 접근 제어자가 붙은 필드는 상속은 받ㅈ지만
//        if(isRunning()){
//            System.out.println("Qㅂ아빠아앙");
//        }else{{"
//            System.out.println(("오방차 세지 비키세요ㅕ"));
//
//        }
//    }
//        /*상속은 자식클래스가 부모클래스를 확장하는 것이므로 FireCar만의 추가기능도 작성가능하다.*/
//
//}
