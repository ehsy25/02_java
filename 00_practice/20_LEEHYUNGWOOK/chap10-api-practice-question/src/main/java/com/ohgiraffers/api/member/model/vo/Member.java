package com.ohgiraffers.api.member.model.vo;

import java.time.LocalDate;

public class Member {

    //필드
    private int memberNo;
    private String memberName;
    private int height;
    private int weight;
    private LocalDate birth;

    //생성자
    public Member() {
    }
    public Member(int memberNo, String memberName, int height, int weight, LocalDate birth) {
        this.memberNo = memberNo;
        this.memberName = memberName;
        this.height = height;
        this.weight = weight;
        this.birth = birth;
    }

    //information
    public String information() {
        return "[" +
                "memberNo : " + memberNo +
                ", memberName : " + memberName +
                ", height : " + height +
                ", weight : " + weight +
                ", birth : " + birth +
                ']';
    }

    //getter
    public int getMemberNo() {
        return memberNo;
    }
    public String getMemberName() {
        return memberName;
    }
    public int getHeight() {
        return height;
    }
    public int getWeight() {
        return weight;
    }
    public LocalDate getBirth() {
        return birth;
    }

    //setter
    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }
}
