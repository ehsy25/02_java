package com.chaewookim.section06.stataickeyword;

public class StaticFieldTest {

    private int nonStaticCount; // instance 당 1개
    private static int staticCount; // class 당 1개

    public void increaseNonStaticCount() {
        this.nonStaticCount++;
    }

    public void increaseStaticCount() {
        // 클래스 변수는 해당 클래스를 통해 참조

        StaticFieldTest.staticCount++;
    }

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    public static int getStaticCount() {
        // static 메소드는 인스턴스를 생성하지 않고 사용하는 메소드
        // 따라서 내부에서 this 키워드 사용 불가

        return staticCount;
    }

}
