package com.ohgiraffers.api.member.vo;

import java.time.LocalDate;

public class Member {
    private int memberNo;
    private String memberName;
    private int height;
    private int weight;
    private String birth;

    public Member(int memberNo, String memberName, int height, int weight, String birth) {
        this.memberNo = memberNo;
        this.memberName = memberName;
        this.height = height;
        this.weight = weight;
        this.birth = birth;
    }

    public String information() {
        return "Member{" +
                "memberNo=" + memberNo +
                ", memberName='" + memberName + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", birth=" + birth +
                '}';
    }
}
