package com.ohgiraffers.section01.polymorphism;

public class Application01 {

    public static void main(String[] args) {

        /*
        * 다형성
        *   다형성이란 하나의 인스턴스가 여러 가지 타입을 가질 수 있다는 것
        * */

        System.out.println("Animal 생성 ======================");
        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();

        System.out.println("Tiger 생성 ======================");
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();

        System.out.println("Rabbit 생성 ======================");
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();

        /*
        * Rabbit과 Tiger는 Animal 클래스를 상속받음
        *
        * Rabbit은 Rabbit 타입이면서 Animal 타입
        * Tiger는 Tiger 타입이면서 Animal 타입        *
        * */

        /* 부모 타입으로 자식 인스턴스 주소 값 저장 가능*/
        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();

        /* Animal은 Animal 타입, Tiger나 Rabbit 타입 x */
//        Rabbit rabbit1 = new Animal();
//        Tiger tiger1 = new Animal();

        System.out.println("동적 바인딩 =======================");
        animal1.cry();
        animal2.cry();

        /*
        * 객체 별로 고유한 기능을 동작시키기 위해서는 레퍼런스 변수를 형 변환하여
        * Rabbit과 Tiger로 변경해야 메소드 호출 가능
        * class type casting : 클래스 형 변환
        * ===> 타입 형 변환시 실제 인스턴스와 타입이 일치하지 않는 경우
        * ClassCastException이 발생 가능
        * */
        System.out.println("클래스 타입 형 변환 확인 =================");
        ((Rabbit) animal1).jump();
        ((Tiger) animal2).bite();
//        ((Tiger) animal1).bite();

        /*
        * instanceof 연산자 이용
        * 레퍼런스 변수가 참조하는 실제 인스턴스가 원하는 타입과 맞는지 비교하는 연산자        *
        * */
        System.out.println("instanceof 확인 ==========================");
        System.out.println("animal1이 Tiger 타입인지 확인 : " + (animal1 instanceof Tiger));
        System.out.println("animal1이 Rabbit 타입인지 확인 : " + (animal1 instanceof Rabbit));
        System.out.println("animal1이 Animal 타입인지 확인 : " + (animal1 instanceof Animal));
        System.out.println("animal1이 Object 타입인지 확인 : " + (animal1 instanceof Object));

        if(animal1 instanceof Rabbit){
            ((Rabbit) animal1).jump();
        }

        if(animal1 instanceof Tiger){
            ((Tiger) animal1).bite();
        }

        /*
        * 클래스 형 변환은 up-casting과 down-casting으로 구분 가능
        * up-casting : 상위 타입으로 형 변환
        * down-casting : 하위 타입으로 형 변환
        * 또한 작성 여부에 따라 명시적과 묵시적 두 가지로 구분*
         */
        Animal animal3 = (Animal) new Rabbit(); // 업 캐스팅(명시적 형 변환)
        Animal animal4 = new Rabbit();  // 업 캐스팅(묵시적 형 변환)

        Rabbit rabbit1 = (Rabbit) animal3;  // Animal -> Rabbit다운 캐스팅(명시적 형 변환)
//        Rabbit rabbit2 = animal3;           // 다운 캐스팅(묵시적 형 변환 불가)



    }
}
