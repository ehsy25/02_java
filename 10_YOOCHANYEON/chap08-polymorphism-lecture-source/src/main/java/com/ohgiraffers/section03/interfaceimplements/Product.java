package com.ohgiraffers.section03.interfaceimplements;

public class Product extends Object implements InterProduct{

    /*
    * 클래스에서 인터페이스를 상속 받을 때는 implements 키워드 사용
    * 또한 인터페이스는 여러 개를 상속 받을 수 있으며, extends로 다른 클래스를 상속 받는 경우
    * 그것과 별개로 인터페이스도 추가 상속이 가능
    * 단, extends 키워드를 앞에 작성하고 implements를 뒤에 작성 (순서 바뀌면 에러 발생)
    * */

    @Override
    public void nonStaticMethod() {
        System.out.println("Product 클래스의 nonStaticMethod 호출");
    }

    @Override
    public void nonStaticMethod1() {
        System.out.println("Product 클래스의 abstMethod 호출");
    }

    /* static 메소드는 오버라이딩 불가 */
//    @Override
//    public static void staticMethod(){}

    /* default 메소드는 인터페이스에서만 작성 가능 */
//    public default void test(){}

    @Override
    public void defaultMethod() {
        System.out.println("Product 클래스의 defaultMethod 호출");
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
