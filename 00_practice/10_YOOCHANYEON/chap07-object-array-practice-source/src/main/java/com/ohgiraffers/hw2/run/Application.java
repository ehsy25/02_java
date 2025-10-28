package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDTO[] sd = new StudentDTO[10];

        int i = 0;
        int[] avg  = new int[10];

        while(true){
            System.out.println("학생 물어볼게 있어 ^^");
            System.out.print("학년이 어떻게 돼?? ");
            int grade = sc.nextInt();
            System.out.print("반이 어떻게 돼?? ");
            int classroom = sc.nextInt();
            System.out.print("이름이 어떻게 돼?? ");
            String blank = sc.nextLine();
            String name = sc.nextLine();
            System.out.print("국어 성적이 어떻게 돼?? ");
            int kor = sc.nextInt();
            System.out.print("영어 성적이 어떻게 돼?? ");
            int eng = sc.nextInt();
            System.out.print("수학 성적이 어떻게 돼?? ");
            int math =  sc.nextInt();

            sd[i] = new StudentDTO(grade,classroom,name,kor,eng,math);

            avg[i] = (sd[i].getKor() + sd[i].getEng() + sd[i].getMath())/3;

            i++;
            System.out.print("이정도면 충분할까?? (y/n)");
            char more =  sc.next().charAt(0);
            if (more == 'y' || more == 'Y') break;
        }

        for(int j = 0; j < i; j++){
            System.out.println(sd[j].info() + "평균 점수 : " + avg[j]);
        }
    }
}
