package com.ohgiraffers.section02.encapsulation.problem3;

public class Monster {

    /*
    * 접근제한자
    * 클래스 혹은 클래스의 맴버(필드, 메소드)에 참조 연산자로 접근할 수 있는 범위를 제한하기 위한 키워드
    * public, protected, default, private
    * 단 클래스 선언 시에는 public, default 만 사용가능
    * */

    /* 필드는 클래스 내부에서만 접근 가능하도록 한다. */
    private String kinds; //맨앞에 (defult) 접근제한자 작성 기본값은 생략
    private int hp; // private를 써서 강제화 부여 다른 클래스에서 사용X

    /* 간접 접근 가능한 메소드를 정의하여 외부에서는 메소드를 통해 간접 접근 하게 한다. */
    public void setInfo(String info){ // 매개변수 참조하여 초기화
        this.kinds = info;
    }
    public String getInfo(){ // 조회목적이여서 매개변수가 없다
        return this.kinds;
    }

    public void setHp(int hp){
        this.hp = Math.max(hp, 0);
    }
    public int getHp(){
        return this.hp;
    }


}
