package com.lhw.section03.interfaceimplements;

public interface InterProduct extends java.io.Serializable,java.util.Comparator {

    /*
    * 인터페이스가 인터페이스를 상속받을 시에는 extends 키워드를 사용하여
    * 이때 여러 인터페이스를 다중 상속받을 수 있다.
    * */

    /* 인터페이스는 상수 필드만 작성 가능하다.
    * [[ public static final ]] 제어자 조합: 상수필드
    * */

    public static final int MAX_NUM = 100;
    /* 인터페이스는 상수필드만 가질 수 있기 때문에 모든 필드는 묵시적으로
    * public static final 이다.*/
    int MIN_NUM = 10;       // 얘도 상수임.

    /*인터페이스는 생성자를 가질 수 없다.*/
//    public InterProduct() {}

    /*인터페이스는 구현부가 있는 non-static 메소드를 가질 수 없다.*/
//    public void nonStaticMethod() {} ⇒ ❌

    public abstract void nonStaticMethod(); // 앞부분이 하얗다(전부 추상메소드인 것)
    void nonStaticMethod2(); //위와 동일한 의미를 갖는다.

    /*JDK 1.8에 추가된 기능*/
    public static void staticMethod() {
        System.out.println("InterProduct 클래스의 staticMethod 호출됨..");
    }

    public default void defaultMethod() {
        System.out.println("InterProduct 클래스의 defaultMethod 호출됨..");
    }
}
