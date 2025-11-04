package com.ohgiraffers.section06.statickeyword;

public class Application {

    public static void main(String[] args) {

        StaticFieldTest f1 = new StaticFieldTest();
        f1.increaseNonStaticCount();
        f1.increaseStaticCount();

        System.out.println(f1.getNonStaticCount()); // 1
        System.out.println(f1.getStaticCount()); // 1

        StaticFieldTest f2 = new StaticFieldTest();
        f2.increaseNonStaticCount();
        f2.increaseStaticCount();

        System.out.println(f2.getNonStaticCount()); // 1
        System.out.println(f2.getStaticCount()); // 2 클래스가 바뀌어도 공유가 되는 값

    }
}
