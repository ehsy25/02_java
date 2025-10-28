package com.ohgiraffers.section01.method;

public class Application3 {
    // 전역
    static int global = 10; // 클래스(static) 변수

    public static void main(String[] args) {

        int local = 20; // 지역변수
        System.out.println("global = " + global);
        System.out.println("local = " + local);
        test(local);

        Application3 app = new Application3();
        app.testMethod(13);
        app.testMethod(local);
        app.testMethod((int)12.35);
        app.testMethod(3 * 8);

        new Application3().testMethod(local);
    }

    public static void test(int testvalue) { // testValue : 매개변수
        System.out.println(testvalue);
    }

    public void testMethod(int age) {
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}
