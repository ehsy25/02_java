package com.ohgiraffers.section06.statickeyword;

public class StaticFieldTest {

    private int nonStaticCount;     // 인스턴스 변수(인스턴스 당 1개)
    private static int staticCount; // 클래스 변수(클래스 당 1개)

    public void increaseNonStaticCount() {
        /*
        * 인스턴스 변수는 해당 인스턴스의 주소(this)를 통해 참조해야 함
        * this.은 생략해도 complier가 자동으로 생성해 주는 구문
        * */

        this.nonStaticCount++;
    }

    public void increaseStaticCount() {
        /* 클래스 변수는 해당 클래스를 통해 참조 */
        StaticFieldTest.staticCount++;
    }

    public int getNonStaticCount() {
        /*
        * static 메소드는 인스턴스를 생성하지 않고 사용하는 메소드
        * 따라서 내부에서 this 키워드 사용 불가
        * */
        return nonStaticCount;
    }

    public int getStaticCount() {
        return staticCount;
    }
}
