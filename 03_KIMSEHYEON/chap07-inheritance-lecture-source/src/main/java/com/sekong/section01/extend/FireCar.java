package com.sekong.section01.extend;


    public class FireCar extends Car{
        public FireCar() {
            /*
            * 모든 생성자 맨 첫 줄에 super()를 컴파일러가 자동으로 추가한다.
            * 부모의 기본 생성자*/
            super();
            System.out.println("fire car 클래스 기본 생성자 호출");
        }
        // soundHorn메소드 재작성 :overriding
        // @Override 어노테이션 : 오버라이팅 성립 요건을 체그하여  성립도지 않는  경우 컴파일 에러 발생

        @Override
        public void soundHorn() {
            super.soundHorn();
            // private 접근제어자가 붙은 필든느 상속은 받지만 자식이 접근할 수 없다.
            // protected로 변경하면 자식이 접근할 수 있다.
            if(isRunning()){
                System.out.println("빵빵");
            }else{
                System.out.println("비켜주세요");
            }
        }
        // 상속은 자식 클래스가 부모 클래스를 확장하는 것이므로 FireCar만의 추가기능도 작성가능하다.
        public void sprayWater(){
            System.out.println("물을 뿌립니다");
        }
    }

