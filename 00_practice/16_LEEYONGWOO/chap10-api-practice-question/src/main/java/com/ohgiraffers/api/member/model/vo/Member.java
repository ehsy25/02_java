package com.ohgiraffers.api.member.model.vo;

public class Member {
    private int memberNo;
    private String memberName;
    private int height;
    private int weight;
    private String birth;


    public String information(){
        return this.memberNo+" "+this.memberName + " " + this.height + "cm " + this.weight + "kg " + this.birth;
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

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
}
