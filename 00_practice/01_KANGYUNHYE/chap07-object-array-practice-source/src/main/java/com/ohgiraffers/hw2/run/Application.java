package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentDTO[] studentsArr =  new StudentDTO[10];

        int count = 0;
        char yesNo;
        do {
            studentsArr[count] = new StudentDTO();
            System.out.print("학년 : ");
            studentsArr[count].setGrade(sc.nextInt());
            sc.nextLine();
            System.out.print("반 : ");
            studentsArr[count].setClassroom(sc.nextInt());
            sc.nextLine();
            System.out.print("이름 : ");
            studentsArr[count].setName(sc.nextLine());
            System.out.print("국어점수 : ");
            studentsArr[count].setKor(sc.nextInt());
            System.out.print("영어점수 : ");
            studentsArr[count].setEng(sc.nextInt());
            System.out.print("수학점수 : ");
            studentsArr[count].setMath(sc.nextInt());

            System.out.print("계속 입력하시겠습니까? ");
            yesNo = sc.next().charAt(0);
            count++;

        } while(yesNo == 'y'||yesNo=='Y');

        int avg[] = new int[count];

        for(int i = 0; i< count ;i++){
            avg[i] = (studentsArr[i].getEng()+studentsArr[i].getKor()+studentsArr[i].getMath())/3;
            System.out.print(studentsArr[i].information());
            System.out.println(" 평균 = " + avg[i]);
        }



    }


}
