package com.ohgiraffers.hw2.model.dto;

public class StudentDTO {

    private int grade; // 학년
    private int classroom; // 반
    private String name ; // 이름
    private int kor;  // 국어점수
    private int eng ; // 영어점수
    private int math; // 수학점수

    public StudentDTO() {
    }

    public StudentDTO(int grade, int classroom, String name, int kor, int eng, int math) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String information() {
        return "StudentDTO{" +
                "grade=" + grade +
                ", classroom=" + classroom +
                ", name='" + name + '\'' +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                '}';
    }

    public int avg(){

        int avg = (this.eng + this.math + this.kor)/3;
        return avg;
    }


}
