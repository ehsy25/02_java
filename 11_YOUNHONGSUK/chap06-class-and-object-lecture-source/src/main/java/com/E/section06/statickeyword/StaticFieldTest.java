package com.E.section06.statickeyword;

public class StaticFieldTest {

    private int nonStaticCount; //인스턴스 변수(인스턴스 당 1개)
    private static int staticCount; // 클래스 변수 (클래스 당 1개)

    /**/

    public void increaseNonStaticCount(){
        nonStaticCount++;
    }
    public void increaseStaticCount(){
        //클래스 변수는 해당 클래스를 통해 참조한다
        // this는 해당 인스턴스의 주소를 참조하는 것이기에 this.staticCount++ 가 안 된다
        StaticFieldTest.staticCount++;
    }

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    public static int getStaticCount() {
     /*static 메소드는 인스턴트를 생성하지 않고 사용하는 메소드
     * 따라서 내부에서 this 키워드를 사용할 수 없다*/
     // return this.staticCount;
        return staticCount;
    }
}
