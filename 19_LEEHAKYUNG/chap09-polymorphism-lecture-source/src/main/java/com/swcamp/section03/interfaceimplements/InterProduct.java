package com.swcamp.section03.interfaceimplements;

// 인터페이스는 여러개 상속 가능(실제 다중 상속은 아님, 그렇게 보이는 것임.)
public interface InterProduct extends java.io.Serializable, java.util.Comparator {

    /*
    인터페이스가 인터페이스를 상속받을 시에는 extends 키워드를 이용하며
    이때 여러 인터페이스르 다중 상속 받을 수 있다.
     */
    /*
    인터페이스는 상수 필드만 작성 가능하다.
    "public static final" 제어자 조합을 "상수 필드"라고 부른다.
     */
    final int MAX_NUM = 100;
    /*
    인터페이스는 상수 필드만 가질 수 있기때문에 굳이 public static final을 명시하지 않아도
    묵시적으로 모두 public static fianl이다.
     */
    int MIN_NUM = 10;
//    private int privateNum = 10;  >> 이건 안됨.

    /*
    interface는 생성자를 가질 수 없다.
     */
//    public InterProduct() {}

    /*
    인터페이스는 구현부가 있는 non-static 메소드를 가질 수 없다.
    구현부가 없는 추상 메소드만 가질 수 있기 때문
     */
//    public void nonStaticMethod() {}
    /*
    인터페이스 안에 작성한 메소드는 묵시적으로 public static abstract의 의미를 가진다.
    (다른 접근제한자 사용불가)
    따라서 인터페이스의 메소드를 오버라이딩 하는 경우
    반드시 접근제한자를 public으로 해야 오버라이딩 가능하다.
     */
    public abstract void nonStaticMethod();
    void nonStaticMethod2();    // 위에랑 똑같음.

    /*
    JDK 1.8 추가된 기능
     */
    public static void staticMethod() {
        System.out.println("InterProduct 클래스의 staticMethod 호출됨..");
    }
    /*
    JDK 1.8 추가된 기능
     */
    public default void defaultMethod() {
        System.out.println("InterProduct 클래스의 defaultMethod 호출됨");
    }
}
