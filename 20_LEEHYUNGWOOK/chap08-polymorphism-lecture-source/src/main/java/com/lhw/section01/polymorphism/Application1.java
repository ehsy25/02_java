package com.lhw.section01.polymorphism;

public class Application1 {

    public static void main(String[] args) {

        /*
        * 다형성
        *   다형성이란 하나의 인스턴스가 여러 가지 타입을 가질 수 있음을 의미
        * */
        System.out.println("====Animal생성====");
        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();

        System.out.println("====Tiger생성====");
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();

        System.out.println("====Rabbit생성====");
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();

        /*
        * Rabbit과 Tiger는 Animal클래스를 상속받았다.
        *
        * - Rabbit은 Rabbit타입이기도 하면서 Animal타입이기도 하다.
        * - Tiger은 Tiger타입이기도 하면서 Animal타입이기도 하다.
        * */
        System.out.println("====다형성====");
        /* 부모 타입으로 자식 인스턴스 주속밧 저장*/
        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();

        /* Animal은 Animal 타입이지, Tiger나 Rabbit이 아니다.*/
        // Rabbit rabbit1 = new Animal();
        // Tiger tiger1 = new Animal();
        System.out.println("동적 바인딩 =======");
        /*컴파일에는 animal로 실행이 된다(부모).
        * 이 부모 내용의 메소드를 호출하려고 봤더니, 그 주소값이 바라보는 곳이 상속받은
        * 자녀 클래스에서 재정의를 한 상태가 있다고 한다면, 실행시점에
        * 부모 메소드를 실행하는 것이 아니라 자식 메소드의 우선권을 가지게 된다.*/
        animal1.run();
//        animal2.
        /* 자식 메소드가 호출되는 것을 볼 수 있다.*/

        /*
        *  객체별로 고유한 기능을 동작시키기 위해서는 레퍼런스 변수를 형변환하여 Rabbit 과
        * Tiger로 변경해야 메소드 호출이 가능하다.
        * class Type casting: 클래스 형변환
        * ===> 타입 형변환시 실제 인스턴스와 타입이 일치하지 않는 경우 ClassCaseException
        * 이 발생할 수 있다.
        * */
        System.out.println("클래스 타입 형변환 확인 ======");
        ((Rabbit) animal1).jump();
        ((Tiger) animal2).bite();

//        ((Tiger) animal1).bite(); // 컴파일 시에는 문제 없으나 런타임에러 발생

        /*
        * instanceof 연산자 이용
        * 레퍼런스 변수가 참조하는 실제 인스턴스가 원하는 타입과 맞는지 비교하는 연산자
        * */
        System.out.println("instanceof 확인 ===============");
        System.out.println("animal1이 Tiger 타입인지: " + (animal1 instanceof Tiger));
        System.out.println("animal1이 Rabbit 타입인:  " + (animal1 instanceof Rabbit));
        System.out.println("animal1이 Animal 타입인:  " + (animal1 instanceof Animal));
        System.out.println("animal1이 Object 타입인:  " + (animal1 instanceof Object));

        if (animal1 instanceof Rabbit) {
            ((Rabbit) animal1).jump();
        }

        if (animal1 instanceof Tiger) {
            ((Tiger) animal1).bite();
        }

        /*
        * 클래스 형변환은 up-casting 과 down-casting으로 구분할 수 있다.
        * up-casting: 상위 타입으로 형변환
        * down-casting: 하위 타입으로 형변환
        * 또한 작성 여부에 따라서 명시적 / 묵시적 두 가지로 구분된다.
        * */

        Animal animal3 = (Animal) new Rabbit(); //업케스팅(명시적 형변환)
        Animal animal4 = new Rabbit();          //업케스팅(묵시적 형변환)

        Rabbit rabbit1 = (Rabbit) animal3;      //다운케스팅(명시적 형변환)
//        Rabbit rabbit2 = animal3;               //다운케스팅 묵시정 형변환은 안된다.
    }
}
