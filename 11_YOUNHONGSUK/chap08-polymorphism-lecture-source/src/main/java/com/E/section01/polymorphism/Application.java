package com.E.section01.polymorphism;

public class Application {
    public static void main(String[] args){

        System.out.println("Create animal ============");
        Animal a1 = new Animal();
        a1.eat();
        a1.run();
        a1.cry();


        System.out.println("Create tiger ============");
        Tiger t1 = new Tiger();
        t1.eat();
        t1.run();
        t1.cry();
        t1.bite();

        System.out.println("Create rabbit ============");
        Rabbit r1 = new Rabbit();
        r1.eat();
        r1.run();
        r1.cry();
        r1.jump();

/*부모 타입으로 자식 인스턴스 주소값 저장*/

        //upcasting
        Animal a2 = new Rabbit();
        Animal a3 = new Tiger();

        //Rabbit rabbit = new Animal();
        // animal은 rabbit이 아니기에, 부모는 자식이 되지 못 한다 반대는 가능하지만


        /*동적 바인딩의 예시
        * 처음 컴파일시 부모 클래스의 메소드로 연결이 되지만, 런타임시 오버라이딩이 가능하다면
        * 자식의 메소드로 실행이 된다*/
        a2.cry();
        a3.cry();

        /*객체별로 고유한 기능을 동작시키기 위해서는 각 클래스로 형변환이 필요하다
        class type casting: 클래스 형변환
        타입 형변환시 실제 인스턴스와 타입이 맞지 않는 경우 ClasscastException
        * */

        /*a3는 호랑이 클래스가 동물 클래스를 레퍼런스해서 만들어진 객체이다
        * 기본적으로는 동물 클래스 취급이기에 호랑이 클래스의 고유 함수인 물기()를 사용 할 수 없다
        * 그렇기에 호랑이 클래스 취급하라고 캐스팅을 해줘야 물기()를 사용 할 수 있다*/
        ((Tiger)a3).bite();


        /*instanceOf
        * 레퍼런스 변수가 참조하는 실제 인스턴스가 원하는 타입과 맞는지 비교하는 연산자*/
        System.out.println("instanceOf check");
        System.out.println("is a2 a tiger : " + (a2 instanceof Tiger));
        System.out.println("is a2 a rabbit : " + (a2 instanceof Rabbit));
        System.out.println("is a2 an animal :" + (a2 instanceof Animal));
        System.out.println("is a2 an object : " + (a2 instanceof Object));

        if((a2 instanceof Tiger)){
            ((Tiger)a2).bite();
        }

        if((a2 instanceof Rabbit)){
            ((Rabbit)a2).jump();
        }

//upcasting
        Animal a4 = (Animal) new Rabbit();
        //downcasting은 묵시적 형변환은 안 된다
        Rabbit r2 = (Rabbit) a4;


    }

}
