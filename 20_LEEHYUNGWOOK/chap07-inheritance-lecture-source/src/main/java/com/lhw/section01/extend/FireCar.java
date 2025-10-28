package com.lhw.section01.extend;

public class FireCar extends Car{

    /* Car 클래스의 모든 멤버(필드, 메소드)를 상속받을 수 있다.
    * 단, 생성자는 상속받지 못한다.*/

    public FireCar() {
        /*
        * 모든 생성자 맨 첫 줄에 super()를 컴파일러가 자동으로 추가한다.
        * 부모의 기본 생성자를 호출하는 구문으로 명시적/묵시자적
        * */
        super(); // 부모 생성자 호출 (없어도 컴파일러가 생성함)
        System.out.println("FireCar 클래스 기본 생성자입니다");
    }

    /*
    * soundHorm 메소드 재작성 : Overriding
    * @Override 어노테이션 : 오버라이딩 성립요건을 체크해서 성립되지 않는
    * 경우 컴파일 에러를 발생시킨다.
    * */
    @Override
    public void soundHorn() {
        //super.soundHorn(); // super: Car꺼

        /*
        * private 접근제어자가 붙은 필드는 상속은 받지만 자식이 접근할 수 없다.
        * protected로 변경하면 자식이 접근할 수 있다.
        * */
        if (isRunning()) {
            System.out.println("빼애애앰📣📣📣");
        } else {
            System.out.println("소방차가 앞으로 못갑니다 비키세요.");
        }
    }

    /*
    * 상속은 자식 클래스가 부모 클래스를 확장하는 것이므로 FireCar 만의 추가
    * 기능도 작성가능하다.
    * */
    public void sprayWater() {
        System.out.println("물을 뿌립니다.💦💦💦");
    }
}
