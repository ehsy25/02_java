package com.ohgiraffers.section02.abstractclass;

public class Application {


    public static void main(String[] args) {

        /*
         * 추상 클래스와 추상 메소드
         *
         * 추상 메소드를 0개 이상 포함하는 클래스를 추상 클래스라고 함
         * 추상 클래스는 클래스 선언부에 abstract 키워드를 명시해야 함
         * 추상 클래스로는 인스턴스 생성 불가
         * 추상 클래스를 사용하려면 추상 클래스를 상속 받는 하위 클래스를
         * 이용하여 인스턴스를 생성해야 함
         * 이 때 추상 클래스는 상위 타입으로 사용될 수 있으며, 다형성 이용 가능
         *
         * 추상 클래스에 작성한 추상 메소드는 반드시 후손이 오버라이딩해서 작성해야 하며,
         * 후손 클래스들의 메소드들의 공통 인터페이스로의 역할을 수행 가능
         * 추상 클래스에 작성한 메소드를 호출하게 되면 실제 후손 타입의
         * 인스턴스가 가지는 메소드로는 다형성이 적용되어 동적 바인딩에 의해 다양한 응답을 할 수 있게 됨
         *
         * 추상 클래스를 상속 받아 구현할 때는 extends 키워드를 사용
         * -> 자바에서 extends로 클래스를 상속 받을 시 하나의 부모 클래스만 소유 가능(단일 상속)
         *
         * 추상 메소드란?
         * 메소드의 선언부만 있고 구현부가 없는 메소드를 추상메소드라고 함
         * 추상 메소드의 경우 반드시 abstract 키워드를 메소드 헤드에 작성해야 함
         * ex) public abstract void method();
         * */
        /* 추상 클래스는 인스턴스화 불가 */
//        Product product = new Product();

        SmartPhone smartPhone = new SmartPhone();

        System.out.println(smartPhone instanceof SmartPhone);
        System.out.println(smartPhone instanceof Product);
    }

    /* 다형성을 적용하여 추상 클래스를 레퍼런스 타입으로 사용 가능 */

    Product product = new SmartPhone();
    /* 정적 바인딩 -> Product, 동적 바인딩 -> SmartPhone */
//    product.abstMethod();

}
