package com.ogiraffers.section06.statickeyword;

public class Application {
    public static void main(String[] args) {
    StaticFieldTest f1 =new StaticFieldTest();
    StaticFieldTest f2 =new StaticFieldTest();
    f1.increaseNonStaticCount();
    f1.increaseStaticCount();
        System.out.println(f1.getStaticCount());
        System.out.println(f1.getNonStaticCount());

    f2.increaseNonStaticCount();
    f2.increaseStaticCount();
        System.out.println(f2.getStaticCount());
        System.out.println(f2.getNonStaticCount());

    }
}
