package com.ohgiraffers.section01.user_type;

public class Application {
    public static void main(String[] args) {
        /* 사용자 정의 자료형 사용하기 */
    /* 변수 선언 및 객체 생성
    클래스명 변수명 = new 클래스명(); <- 객체(instance)를 생성하는 구문이다.
    객체를 생성하게 되면 클래스에 정의한 필드(전역변수)와 메소드대로 개겣가 head 영역에 생성된다.
     */
        Member member = new Member(); //member안에는 주소값이 들어가있음
        member.id="user01";
        member.name="안영신";
        member.age=20;
        member.gender='M';
        //member.hobby = {"야구", "코딩"};


        /*
        필드에 접근하기 위해 레퍼런스변수명.필드명으로 접근한다.
        '.'은 참조연산자이며 레퍼런스 변수가 참조하는 주소로 접근한다는 의미를 가진다.
        heap영역은 기본적으로 JVM 초기값으로 초기화 된다. (String은 null, int는 0, double은 0.0, boolean은 false)
         */
        System.out.println("member.id = "+member.id);
        System.out.println("member.name = " + member.name);
        System.out.println("member.age = " + member.age);
        System.out.println("member.gender = " + member.gender);
        System.out.println("member.hobby = " + member.hobby);




    }
}
