package com.lhw.section01.polymorphism;

import javax.swing.plaf.basic.BasicRadioButtonMenuItemUI;

public class Application2 {

    public static void main(String[] args) {
        /*
         * 객체배열에는 하나의 타입밖에 들어갈 수 없다. Tiger와 Rabbit을 모두
         * 쓰고 싶다고 할 때, 둘이 모두 상속하는 Animal을 이용해 둘 다 사용가능
         * */
        Animal[] animals = new Animal[5];
        animals[0] = new Rabbit();  //다형성(업케스팅)
        animals[1] = new Tiger();
        animals[2] = new Rabbit();
        animals[3] = new Tiger();
        animals[4] = new Rabbit();

        /* Animal 클래스가 가지는 메소드를 오버라이딩 한 메소드 호출 시
        동적 바인딩을 이용하여 출력한다.*/
        for (int i = 0; i < animals.length; i++) {
            animals[i].cry();
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Rabbit) {
                ((Rabbit) animals[i]).jump();
            } else if (animals[i] instanceof Tiger) {
                ((Tiger) animals[i]).bite();
            } else {
                System.out.println("토끼나 호랑이가 아닙니다.");
            }
        }
    }
}
