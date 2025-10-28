package com.ohgiraffers.hw1.model.dto;

public class StudentDTO extends PersonDTO{
    private int grade;
    private String major;
    public StudentDTO() {
    }

    public StudentDTO(String name, int age, double height, double weight, int grade, String major) {
        super(name, age, height, weight);
        this.grade = grade;
        this.major = major;
    }

    @Override
    public String information() {
        String result =  super.information();
        result = result + " | " + grade + " | " + major;
        return result;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
