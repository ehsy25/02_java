package com.sekong.section02.encapsulation.problem1;

public class Application2 {
    public static void main(String[] args) {
        Monster m1 = new Monster();
        // 직접접근
//        m1.name = "두치";
//        m1.hp = 200;
        /* 직접 접근이 아닌 메소를 통한 간접 접근을 작성해 두더라도
         *접근 제한자를 통해 강제화하지 않으면 직접 접근이 가능한 try
         * 그래서 접근제한자를 설정한다.
         * ==> 필드는 private, 메소드는 Public => 캡슐화 적용*/
        m1.setInfo("두치");
        m1.setHp(200);
        System.out.println("m1.name: " + m1.getInfo());
        System.out.println("m1.hp: " + m1.getHp());
        Monster m2 = new Monster();
        m2.setInfo("뿌꾸");
        m2.setHp(-100);
        System.out.println("m2.name: " + m2.getInfo());
        System.out.println("m2.hp: " + m2.getHp());


    }
}
