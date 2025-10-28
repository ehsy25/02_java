package com.chaewookim.hw1.model.dto;

public class StudentDTO extends PersonDTO {

    private int grade;
    private String major;

    public StudentDTO(int grade) {}

    public StudentDTO(int age, double height, double weight, int grade, String major, String name) {
        super(age, height, weight);
        this.grade = grade;
        this.major = major;

        super.name = name;
    }

    public String information() {
        return "StudentDTO{" +
                "grade=" + grade +
                ", major='" + major + '\'' +
                ", name='" + name + '\'' +
                ", weight='" + getWeight() + '\'' +
                ", height='" + getHeight() + '\'' +
                ", age='" + getAge() + '\'' +
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
