package com.ohgiraffers.hw2.model.dto;

public class StudentDTO {

    //필드
    private int grade;
    private int classroom;
    private String name;
    private int kor;
    private int eng;
    private int math;

    //생성자
    public StudentDTO() {}
    public StudentDTO(int grade, int classroom, String name, int kor, int eng, int math) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    //information
    public String information() {
        return name+"의 정보: \n[" +
                grade + "학년 "+
                classroom +"반 " +
                "| 이름: " + name +
                ", 국어점수: " + kor +
                ", 영어점수: " + eng +
                ", 수학점수: " + math;
    }

    //getter
    public int getGrade() {
        return grade;
    }
    public int getClassroom() {
        return classroom;
    }
    public String getName() {
        return name;
    }
    public int getKor() {
        return kor;
    }
    public int getEng() {
        return eng;
    }
    public int getMath() {
        return math;
    }

    //setter
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setKor(int kor) {
        this.kor = kor;
    }
    public void setEng(int eng) {
        this.eng = eng;
    }
    public void setMath(int math) {
        this.math = math;
    }
}
