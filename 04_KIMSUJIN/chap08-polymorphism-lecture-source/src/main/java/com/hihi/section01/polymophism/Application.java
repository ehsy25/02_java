package com.hihi.section01.polymophism;

public class Application {
    public static void main(String[] args) {
    /*다형성
    * 다형성이란 하나의 인스턴스가 여러 가지의 타입을 가질 수 있다는 것을 의미한다.
    * */

        System.out.println("Animal 생성 ====================");
        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();

        System.out.println("tiger 생성 ====================");
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();

        System.out.println("Rabbit 생성 ====================");
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();

        /*
        * Rabbi과 Tiger는 Animal클래스를 상속받았다.
        *
        * Rabbit은 Rabbit타입이기도 하면서 Animal타입이기도 하다.
        * Tiger는 Tiger타입이기도 하면서  Animal타입이기도 하다
        * */

        /*부모 타입으로 자식 인스턴스 주소값 저장*/
        Animal animal1 = new Rabbit();      //업캐스팅
        Animal animal2 = new Tiger();

        /* Animal은 Animal 타입이지 Tiger나 Rabbit이 아니다.*/
//        Rabbit rabbit1 = new Animal(); ==> 불가능
//        Tiger tiger1 = new Animal();

        System.out.println(" 동적 바인딩 ====================");
        animal1.cry();
        animal2.cry();
//        animal2.bite(): tiger의 bite메소드 사용 불가 => 다운캐스팅 해야함

        /*
        * 객체별로 고유한 기능을 동작시키기 위해서는 레퍼런스 변수를 형변환하여
        * Rabbit과 Tiger로 변경해야 메소드 호출이 가능하다.
        * class type casting: 클래스 형변환
        * ====> 타입 형변환시 실제 인스턴스와 타입이 일치하지 않는 경우
        * ClassCastException이 발생할 수 있다.*/
        System.out.println("클래스타입 형변환 확인 ===========");
        ((Rabbit) animal1).jump();
        ((Tiger) animal2).bite();

//        ((Tiger) animal1).run(); 런타임에러(ClassCastException) => animal1은 래빗을 참조중임.

        /*
        * instanceof 연산자 이용
        * 레퍼런스변수가 참조하는 실제 인스턴스가 원하는 타입과 맞는지 비교하는 연산자
        * */

        System.out.println("instanceof 확인 ==========");
        System.out.println("animal1이 Tiger타입인지 확인 : " + (animal1 instanceof Tiger));
        System.out.println("animal1이 Rabbit타입인지 확인 : " + (animal1 instanceof Rabbit));
        System.out.println("animal1이 Animal타입인지 확인 : " + (animal1 instanceof Animal));
        System.out.println("animal1이 Object타입인지 확인 : " + (animal1 instanceof Object));
        //animal1 => Rabbit, Animal, Object타입임.

        if(animal1 instanceof Rabbit){
            ((Rabbit) animal1).jump();
        }

        if(animal1 instanceof Tiger){
            ((Tiger) animal1).bite();
        }

        /*
        * 클래스 형변환은 up-casting과 down-casting으로 구분할 수 있다.
        * up-casting : 상위 타입으로 형변환
        * down-casting : 하위 타입으로 형변환
        * 또한 작성여부에 따라 명시적과 묵시적 두가지로 구분된다.*/

        Animal animal3 = (Animal) new Rabbit(); //업캐스팅(명시적 형변환)
        Animal animal4 = new Rabbit();              //업캐스팅(묵시적)

        Rabbit rabbit1 = (Rabbit) animal3;      // Animal -> Rabbit 다운캐스팅(명시적 형변환)
//        Rabbit rabbit2 = animal3;                   //다운캐스팅 묵시적 형변환 불가

    }
}
