package com.ohgiraffers.section03.interfaceimplements;


public interface InterProduct extends java.io.Serializable, java.util.Comparator{

    /* 인터페이스가 인터페이스를 상속받을 시 extends 키워드를 이용하며
    * 이 때 여러 인터페이스를 다중 상속 가능
    * */

    /* 인터페이스는 상수 필드만 작성 가능
    * [[ public static final ]] 제어자 조합을 [상수 필드]라고 부름
    * */
    public static final int MAX_NUM = 100;
    /* 인터페이스는 상수 필드만 가질 수 있기 때문에 모든 필드는 묵시적으로
    * public static final이 포함
    * */
    int MIN_NUM = 10;

    /* 인터페이스는 생성자를 가질 수 없음*/
//    public InterProduct() {};

    /* 인터페이스는 구현부가 있는 non-static 메소들르 가질 수 없음 */
//    public void nonStaticMethod() {}

    /*
    * 인터페이스 안에 작성한 메소드는 묵시적으로 public static abstract의 의미를 지님
    * (다른 접근 제한자 사용 불가)
    * 따라서 인터페이스의 메소드를 오버라이딩하는 경우
    * 반드시 접근 제한자를 public 으로 해야 오버라이딩 가능
    * */
    public abstract void nonStaticMethod();
    void nonStaticMethod1();

    /* JDK 1.8 추가된 기능 */
    public static void staticMethod() {
        System.out.println("InterProduct 클래스의 staticMethod 호출");
    }

    /* JDK 1.8 추가된 기능 */
    public default void defaultMethod() {
        System.out.println("InterMethod 클래스의 defaultMethod 호출");
    }


}
