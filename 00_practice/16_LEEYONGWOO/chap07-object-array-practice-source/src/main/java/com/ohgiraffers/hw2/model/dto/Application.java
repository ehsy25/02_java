package com.ohgiraffers.hw2.model.dto;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StudentDTO[] st=new StudentDTO[10];
        double[] avg=new double[10];

        int tmp=0;
        do {

            System.out.print("학년을 입력하세요 : ");
            int grade=sc.nextInt();

            System.out.print("반을 입력하세요 : ");
            int classroom=sc.nextInt();

            System.out.print("이름을 입력하세요 : ");
            String name=sc.next();

            System.out.print("국어점수를 입력하세요 : ");
            int kor=sc.nextInt();
            avg[tmp]+=kor;

            System.out.print("영어점수를 입력하세요 : ");
            int eng=sc.nextInt();
            avg[tmp]+=eng;

            System.out.print("수학점수를 입력하세요 : ");
            int math=sc.nextInt();
            avg[tmp]+=math;

            st[tmp]=new StudentDTO(grade,classroom,name,kor,eng,math);

            avg[tmp]/=3;

            System.out.print("계속 추가하시겠습니까?(Y/N)");
            char c=sc.next().charAt(0);
            if(c=='N'||c=='n'){
                break;
            }
            tmp++;
        }while(true);

        for(int i=0; i<=tmp; i++){
            System.out.println(st[i].information()+" 평균 : "+(int)avg[i]);
        }

    }
}
