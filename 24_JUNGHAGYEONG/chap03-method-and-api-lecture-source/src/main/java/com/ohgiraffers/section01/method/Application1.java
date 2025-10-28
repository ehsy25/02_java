package com.ohgiraffers.section01.method;

public class Application1 {

    public static void main(String[] args) {
        System.out.println("main() 시작함");
        Application1.methodA(); // static가 붙어있을때는 클래스명.메소드면
        System.out.println("main() 종료됨");
    }

    public static void methodA() {
        System.out.println("methodA() 호출됨..");
        methodB(); // 같은 클래스내의 static 메소드는 클래스명 생략 가능
    }

    /***
     * methodB()입니다.
     */
    public static void methodB() {
        System.out.println("methodB() 호출됨");
        System.out.println("methodB() 종료됨");
    }
}
