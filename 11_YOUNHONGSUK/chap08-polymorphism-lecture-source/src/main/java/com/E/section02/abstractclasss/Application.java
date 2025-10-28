package com.E.section02.abstractclasss;

public class Application {
    public static void main(String[] args) {
        /*추상 클래스와 추상 메소드*/

        //추상 클래스는 인스턴스화 불가
        //추상 클래스는 추상 메소드 (미완성 메소드)를 포함해서 생성하고 메모리를 할당 하지 않는다
        //Product p = new Product();

        SmartPhone sp = new SmartPhone();
        System.out.println(sp instanceof SmartPhone);
        System.out.println(sp instanceof Product);

        //다형성을 적용해서 추상 클래스르르 래퍼런스 타입으로 사용할 수 있다
        Product p = new SmartPhone();
        /*정적 바인딩 -> Product, 동적 바인딩 -> SmartPhone*/
        p.abstMethod();
    }
}
