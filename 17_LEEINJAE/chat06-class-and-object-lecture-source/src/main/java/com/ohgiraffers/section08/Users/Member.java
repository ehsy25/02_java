package com.ohgiraffers.section08.Users;

public class Member {

    private int num;
    private String id;
    private String pwd;
    private static name;
    private int age;
    private char gender;

    public Member() {
    }

    public Member(int num, String id, String pwd, int age, char gender) {
        this.num = num;
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.gender = gender;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


}
