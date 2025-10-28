package com.greedy.level02.normal.student.model.vo;

public class StudentVO {
    private int grade;
    private String name;
    private int classroom;
    private double height;
    private char gender;

    public StudentVO() {
    }

    public StudentVO(int grade, String name, int classroom, double height, char gender) {
        this.grade = grade;
        this.name = name;
        this.classroom = classroom;
        this.height = height;
        this.gender = gender;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void printInformation(){
        System.out.println("grade : " + grade);
        System.out.println("name : " + name);
        System.out.println("classroom : " + classroom);
        System.out.println("height : " + height);
        System.out.println("gender : " + gender);
    }
}
