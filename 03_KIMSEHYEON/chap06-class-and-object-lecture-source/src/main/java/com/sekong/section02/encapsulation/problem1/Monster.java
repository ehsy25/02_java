package com.sekong.section02.encapsulation.problem1;

public class Monster {
    // 접근제한자(default) 문자형 변수이름; -> 접근제한자 생략되어있음
    /*
    * 접근 제한자
    * 클래스 혹은 클래스의 멤버(필드, 메소드)에 참조 연산자로 접근할 수 있는 범위를 제한하기 위한 키워드
    * public, protected, default, private
    * 단 클래스 선언 시에는 Public, defaul만 사용 가능*/

    // 필드는 클래스 내부에서만 접근 가능하도록 한다.
    private String name;
    private int hp;
    String kinds;
    // 간접 접근 가능한 메소를 정의하여 외부에서는 메소드를 통해 간접 접근하도록 한다.
    public void setInfo(String info){
        this.name = info;
    }
    public String getInfo(){
        return this.name;
    }
    public void setHp(int hp) {
//        if(hp > 0){
//            // this: 인스턴스 변수가 생성되었을때 자신의 주소를 저장하는 레퍼런스 주소
//            this.hp = hp;
//            System.out.println("양수 값이 입력되어 몬스터의 체력을 입력값으로 변경");
//        }else {
//            this.hp = 0;
//        }
        this.hp = Math.max(hp, 0);
    }
    public int getHp(){
        return hp;
    }
}
