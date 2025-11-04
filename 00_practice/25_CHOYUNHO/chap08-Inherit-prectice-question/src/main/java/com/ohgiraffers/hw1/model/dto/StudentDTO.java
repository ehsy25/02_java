package com.ohgiraffers.hw1.model.dto;

public class StudentDTO extends PersonDTO{
    private int grade;
    private String major;

    public StudentDTO(){}

    public StudentDTO(String name,int age, double height, double weigth, int grade, String major) {
        super(age, height, weigth);
        this.grade = grade;
        this.major = major;
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String information(){
        String str = super.information();
        return str +
                ", grade=" + grade +
                ", major=" + major +
                ", name=" + name;
    }

}
