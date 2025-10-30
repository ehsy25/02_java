package com.ohgiraffers.hw2.model.dto;

import java.util.Scanner;

public class StudentDTO {

    private int grade;
    private int classroom;
    private String name;
    private int kor;
    private int eng;
    private int math;

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


    public String getStudentInformation() {
        return
                "학년 : " + grade +
                        ", 반 : " + classroom +
                        ", 이름 : '" + name +
                        ", 국어점수 : " + kor +
                        ", 영어점수 : " + eng +
                        ", 수학점수 : " + math +
                        ", 평균점수 : " + getAvg()
                ;
    }

    public int getAvg() {
        return (kor + eng + math) / 3;
    }

//    public void studentInput() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("학년 : ");
//        int grade = sc.nextInt();
//
//        System.out.print("반 :");
//        int classroom = sc.nextInt();
//
//        System.out.print("이름 : ");
//        String name = sc.next();
//
//        System.out.print("국어점수 : ");
//        int kor = sc.nextInt();
//
//        System.out.print("영어점수 : ");
//        int eng = sc.nextInt();
//
//        System.out.print("수학점수 : ");
//        int math = sc.nextInt();
//
//        while (true) {
//            String menu = """
//                    ========== 학생 등록 프로그램 ============
//                    계속 추가 하시겠습니까? (y/n)
//                    ==========================================
//                    메뉴 선택 : """;
//            System.out.print(menu);
//            int yn = sc.nextInt();
//
//            switch (yn) {
//                case :
//            }
//        }
//    }
}
