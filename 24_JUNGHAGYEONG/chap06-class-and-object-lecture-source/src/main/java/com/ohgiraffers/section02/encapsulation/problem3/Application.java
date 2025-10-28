package com.ohgiraffers.section02.encapsulation.problem3;

public class Application {

    public static void main(String[] args) {

        /*
        * 직접 접근이 아닌 메소드를 통한 간접 접근을 작성해 두더라도
        * 접근 제한자를 통해 강제화하지 않으면 직접 접근이 가능한 문제가 있음
        * 그래서 접근제한자를 설정 함
        * ==> 필드는 private, 메소드는 public => 캡슐화 적용
        * */
        Monster m1 = new Monster();
//        m1.kinds = "두치";
//        m1.hp = 200;

        m1.setInfo("두치");
        m1.setHp(100);
        System.out.println(m1.getInfo());
        System.out.println(m1.getHp());

        Monster m2 = new Monster();
        m2.setInfo("뿌꾸");
        m2.setHp(-100);
        System.out.println(m2.getInfo());
        System.out.println(m2.getHp());

    }
}
