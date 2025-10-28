package com.chaewookim.section06.stataickeyword;

public class Application {
    public static void main(String[] args) {
        StaticFieldTest f1 = new StaticFieldTest();
        f1.increaseNonStaticCount();
        f1.increaseStaticCount();

        System.out.println(f1.getNonStaticCount());
        System.out.println(f1.getStaticCount());

        StaticFieldTest f2 = new StaticFieldTest();
        f2.increaseNonStaticCount();
        f2.increaseStaticCount();

        System.out.println(f2.getNonStaticCount());
        System.out.println(f2.getStaticCount());
    }
}
