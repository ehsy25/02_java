package com.ohgiraffers.section02.encapsulation.problem2;

public class Monster {

//    String name;
    String kinds; //맨앞에 (defult) 접근제한자 작성 기본값은 생략
    int hp;

    public void setInfo(String info){
//        this.name = info;
        this.kinds = info;

    }
    public String getInfo(){
//        return this.name;
        return this.kinds;
    }


}
