package com.ohgiraffers.hw1.model.dto;

import com.ohgiraffers.hw1.run.Application;

public class StudentDTO extends PersonDTO {
    //필드
    private int grade;
    private String major;

    //생성자
    public StudentDTO() {}
    public StudentDTO(String name, int age, double height, double weight, int grade, String major) {
        super(age, height, weight);
        setName(name);
        this.grade = grade;
        this.major = major;
    }

    //getter
    public int getGrade() {return grade;}
    public String getMajor() {return major;}

    //setter
    public int setGrade(int grade) {this.grade = grade; return this.grade;}
    public String setMajor(String major) {this.major = major; return this.major;}

    //information
    public String information() {
        return super.information() +
                "grade=" + grade +
                ", major=" + major + " " +
                ']';
    }
}
