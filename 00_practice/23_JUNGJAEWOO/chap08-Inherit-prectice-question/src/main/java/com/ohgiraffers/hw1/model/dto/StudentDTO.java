package com.ohgiraffers.hw1.model.dto;

public class StudentDTO extends PersonDTO{
    private int grade;
    private String major;

    public StudentDTO() {
    }

    public StudentDTO(String name,int age, double weight, double height, int grade, String major) {
        super(age, weight, height);
        this.name = name;
        this.grade = grade;
        this.major = major;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                ", name='" + name + '\'' +
                "grade=" + grade +
                ", major='" + major + '\'' +
                '}';
    }
}
