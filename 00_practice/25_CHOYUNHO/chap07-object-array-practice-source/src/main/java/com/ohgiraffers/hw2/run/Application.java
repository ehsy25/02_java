package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentDTO[] stu =  new StudentDTO[10];
        boolean tr = true;
        int count=0;
        Scanner sc = new Scanner(System.in);
        while(tr){
            stu[count] = new  StudentDTO();
            System.out.print("학년 : ");
            stu[count].setGrade(sc.nextInt());
            sc.nextLine();
            System.out.print("반 : ");
            stu[count].setClassroom(sc.nextInt());
            sc.nextLine();
            System.out.print("이름 : ");
            stu[count].setName(sc.nextLine());
            System.out.print("국어 점수: ");
            stu[count].setKor(sc.nextInt());
            System.out.print("영어 점수: ");
            stu[count].setEng(sc.nextInt());
            System.out.print("수학 점수: ");
            stu[count].setMath(sc.nextInt());
            count++;
            sc.nextLine();
            System.out.print("계속 추가하실겁니까? (y: 예) : ");
            char ch=sc.nextLine().charAt(0);
            if(ch == 'y'){
                continue;
            }else{
                break;
            }
        }
        int avg[] = new int[count];
        for(int i=0;i<count;i++){
            avg[i] =( (stu[i].getKor()+stu[i].getEng()+stu[i].getMath())/3 );
        }


        for(int i=0;i<count;i++){
            System.out.print(stu[i].information()+ " ");
            System.out.println(stu[i].getName()+"의 평균은 : " + avg[i] );
        }
    }
}
