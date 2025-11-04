package com.ohgiraffers.hw1.model.dto;

public class Member {

    // 필드
    private String name;
    private int age;
    private char gender;
    private int couponCount;

    //생성자
    public Member() {
    }
    public Member(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //information
    public String toString() {
        return "---회원 정보---" +
                "\n이름 : " + name +
                "\n나이 : " + age +
                "\n성별 : " + gender +
                "\n쿠폰 : " + couponCount +
                "\n------------";
    }

    //getter
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public char getGender() {
        return gender;
    }
    public int getCouponCount() {
        return couponCount;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public void setCouponCount(int couponCount) {
        this.couponCount = couponCount;
    }
}
