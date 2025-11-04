package com.ohgiraffers.hw1.model.dto;

public class StudentDTO extends PersonDTO {

private int grade;
private String major;

    public StudentDTO() {
    }

    public StudentDTO(int age, double height, double weight, int grade, String major) {
        super(age, height, weight);
        this.grade = grade;
        this.major = major;
    }

    @Override
    public String toString() {
        return
                "StudentDTO{" +
                super.info()+
                "grade=" + grade +
                ", major='" + major + '\'' +
                ", name='" + name + '\'' +
                '}';
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
