package com.ohgiraffers.hw1.model.dto;

public class Member {

    private String name;            //회원 이름
    private int age;                //회원 나이
    private char gender;            //회원 성별
    private int couponCount;        //요리학원 쿠폰 갯수 = 0

    /* 기본생성자 */
    public Member() {
    }

    /* 매개변수 있는 생성자 */
    public Member(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getCouponCount() {
        return couponCount;
    }

    public void setCouponCount(int couponCount) {
        this.couponCount = couponCount;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", couponCount=" + couponCount +
                '}';
    }
}
