package com.ohgiraffers.api.member.vo;

import java.time.LocalDate;
import java.util.Arrays;

public class Member {
    private int memberNo;
    private String memberName;
    private int height;
    private int weight;
    private LocalDate birth;

    public Member(int i, String s, int i1, int i2, LocalDate yyyyMMdd) {
        memberNo = i;
        memberName = s;
        height = i1;
        weight = i2;
        birth = yyyyMMdd;
    }

    public int getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberNo=" + memberNo +
                ", memberName='" + memberName + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", birth=" + birth +
                '}';
    }
}
