package com.ohgiraffers.section06.statickeyword;

public class Application {

    private int nonStaticCount;     // 인스턴스 변수(인스턴스 당 1개)
    private static int staticCount; // 클래스 변수(클래스 당 1개)

    public void incrementNonStaticCount() {
        /*
        * 인스턴스 변수는 해당 인스턴스의 주소(this)를 통해 참조해야 한다.
        * this.은 생략해도 compiler가 자동으로 생성해주는 구문이다.
        * */
        this.nonStaticCount++;
    }

    public static void incrementStaticCount() {
        /* 클래스 변수는 해당 클래스를 통해 참조한다. */
        this staticCount++;
    }

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    public static int getStaticCount() {
        /*
        * static 메소드는 인스턴스를 생성하지 않고 사용하는 메소드이다.
        * 따라서 내부에서 this 키워드를 사용할 수 없다.
        * */
//        return staticCount;
    }
}

public  static void main(String[] args) {

    staticFieldTest f1 = new StaticFieldTest();
    f1.increaseNonStaticCount();
    f1.increaseStaticCount();

    System.out.println(f1.getNonStaticCount());
    System.out.println(f1.getStaticCount());

    StaticFieldTest f2 = new StaticFieldTest2();
    f2.increaseNonStaticCount();
    f2.increaseStaticCount();
}
