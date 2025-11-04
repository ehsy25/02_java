package com.E.section03.interfaceimplements;

import com.E.section02.abstractclasss.Product;

public interface InterProduct {

    /*인터페이스가 인터페이스를 상속받으면 extends 키워드를 이용하며
    * 이때 여러 인터페이스를 다중 상속받을 수 있다*/

    //interface can only have final variables
    //[[ public static final]] 제어자 조합을 [상수 필드] 라고 부른다
    public final int MAX = 100;

    //상수만 존재 가능해서 public static final은 묵시적으로 적용된다
    int MIN = 10;


    //인터페이스는 구현부가 있는 non-static메소드를 가질 수 없다
    //객체 생성이 불가능해서, non-static메소드를 애초에 호출 할 수 없다
    //public void nonStaticMethod(){}

    public abstract void nonStaticMethod();

    void testMethod();

    /*근데 1.8 부터는 static 메소드는 작성  가능하다
    또한 defauilt를 추가하면 non-static 메소드를 추가 할 수 있다
    뭐지?*/
    public static void staticMethod(){}

    //default 메소드는 강제성이 없어서, 상속받은 클래스들이 재정의 할 필요가 없다
    public default void defaultMethod(){

    }



}
