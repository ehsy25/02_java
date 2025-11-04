package com.swcamp.section03.interfaceimplements;

// public class Product extends InterProduct 이렇게 인터페이스를 extends로 가져올 순 없음.
public class Product extends Object implements InterProduct {
    // 순서는 항상 extends -> implements로
    /*
    클래스에서 인터페이스를 상속받을 때에는 implements 키워드를 사용한다.
    또한 인터페이스는 여러 개를 상속받을 수 있으며, extends로 다른 클래스를 상속받는 경우에는
    그것과 별개로 인터페이스도 추가 상속이 가능해진다.
    단, extends 키워드를 앞에 작성하고 implements를 뒤에 작성한다.
    (순서 바뀌면 에러 발생)
     */

    @Override
    public void nonStaticMethod() {
        System.out.println("Product 클래스의 nonStaticMethod 호출함");
    }

    @Override
    public void nonStaticMethod2() {
        System.out.println("Product 클래스의 abstMethod 호출함");
    }

    /*
    static method는 오버라이딩 할 수 없다.
     */
//    @Override
//    public static void staticMethod()

    @Override
    public void defaultMethod() {
        System.out.println("Product 클래스의 defaultMethod 호출됨..");
    }

    // default 메소드는 인터페이스 안에서만 작성 가능하다.
//    public default void test()

    // InterProduct에서 java.util.Comparator를 상속받았으므로 Comparator의 compare함수도 재정의해줘야 함.
    @Override
    public int compare(Object o, Object t1) {
        return 0;
    }
}
