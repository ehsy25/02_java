package com.ohgiraffers.api.member.vo;

import java.time.LocalDate;

public class Member {
    private int memberNo;
    private String memberName;
    private int height;
    private int weight;
    private int birth;


    public Member(int memberNo, String memberName, int height, int weight, int birth) {
        this.memberNo = memberNo;
        this.memberName = memberName;
        this.height = height;
        this.weight = weight;
        this.birth = birth;
    }

    public String information(){
        return "Member{" +
                "birth=" + birth +
                ", weight=" + weight +
                ", height=" + height +
                ", memberName='" + memberName + '\'' +
                ", memberNo=" + memberNo +
                '}';
    }


}
