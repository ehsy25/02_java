package com.lhw.section08.users;

public class Member {
    //필드
    private int num;
    private String id;
    private String pwd;
    private String name;
    private int age;
    private char gender;

    // 생성자
    public Member() {
    }
    public Member(int num, String id, String pwd, String name, int age, char gender) {
        this.num = num;
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //getter
    public int getNum() {
        return num;
    }
    public String getId() {
        return id;
    }
    public String getPwd() {
        return pwd;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public char getGender() {
        return gender;
    }

    //setter
    public void setNum(int num) {
        this.num = num;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }


    // toString() -> getInformation
    @Override
    public String toString() { //get Information 과 같은 느낌
        return "[" +
                "num=" + num +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ']';
    }
}
