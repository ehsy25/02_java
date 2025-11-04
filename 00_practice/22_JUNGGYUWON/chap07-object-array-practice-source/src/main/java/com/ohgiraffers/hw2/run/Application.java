package com.ohgiraffers.hw2.run;


import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {



    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        StudentDTO[] arr = new StudentDTO[10];
        int count = 0;
        boolean flag = true;
        do {
            System.out.print("학년을 입력해주세요 : ");
            int grade = sc.nextInt();
            sc.nextLine();
            System.out.print("반을 입력해주세요 : ");
            int classroom = sc.nextInt();
            sc.nextLine();
            System.out.print("이름을 입력해주세요 : ");
            String name = sc.nextLine();
            System.out.print("국어점수를 입력해주세요 : ");
            int kor = sc.nextInt();
            sc.nextLine();
            System.out.print("영어점수를 입력해주세요 : ");
            int eng = sc.nextInt();
            sc.nextLine();
            System.out.print("수학점수를 입력해주세요 : ");
            int math = sc.nextInt();
            sc.nextLine();

            arr[count] = new StudentDTO(grade,classroom,name,kor,eng,math);
            System.out.print("학생을 추가 하시겠습니까? (y or n) :");
            char choice = sc.next().charAt(0);
            if (choice == 'y') {
                count++;
            }
            else{
                flag = false;
            }

        }while(flag);
        System.out.println();
        System.out.println("학년|반|이름|국어점수|영어점수|수학점수|평균");
        for (int i = 0; i <= count; i++) {

            arr[i].information();
        }
    }


}
