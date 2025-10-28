package com.sekong.section06.statickeyword;

public class Application {
    public static void main(String[] args) {
        StaticFieldTest sf = new StaticFieldTest();
        sf.increaseNonStaticCount();
        sf.increaseStaticCount();
        System.out.println(sf.getNonStaticCount());
        System.out.println(sf.getStaticCount());
        StaticFieldTest sf2 = new StaticFieldTest();
        sf2.increaseNonStaticCount();
        sf2.increaseStaticCount();
        System.out.println(sf2.getNonStaticCount());
        System.out.println(sf2.getStaticCount());


    }
}
