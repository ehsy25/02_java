package com.lhw.section06.statickeyword;

public class StaticFieldTest {

    private int nonStaticCount;     // 인스턴스 변수(인스턴스 당 1개)
    public static int staticCount; // 클래스 변수(클래스 당 1개

    public void increaseNonStaticCount() {
        /*인스턴스 변수 => this(인스턴스의 주소값을 가리키는 것)
        * 로 참조한다.*/
        this.nonStaticCount++;
    }

    public void increaseStaticCount() {
        //this.staticCount++; -> static 변수를 굳이 this. 레퍼렌스로 참조하는 것
        StaticFieldTest.staticCount++; // => static 변수로 참조해야한다.
    }

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    public static int getStaticCount() {
        /*static 메소드는 인스턴스 생성 전 이미 생성 된 녀석들.
        * 따라서 내부에서 this 키워드를 사용할 수 없다.*/
        return StaticFieldTest.staticCount;
    }
}
