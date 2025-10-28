package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDTO[] st = new StudentDTO[10];
        int count = 0;
        while(count < 10){
            System.out.print("학생을 추가할거면 1 종료할거면 2를 입력해주세요 : ");
            int input = sc.nextInt();
            if(input == 1) {
                System.out.print("학생 정보를 입력하세요 : ");
                int grade = sc.nextInt();
                int classroom = sc.nextInt();
                String name = sc.next();
                int kor = sc.nextInt();
                int eng = sc.nextInt();
                int math = sc.nextInt();
                st[count++] = new StudentDTO(grade, classroom, name, kor, eng, math);
            } else {
                break;
            }
        }
        for(int i = 0; i < count; i++) {
            System.out.println(st[i].getName()+ "의 평균점수 : " +st[i].avarage());
        }
        for(int i = 0; i < count; i++) {
            System.out.println(st[i].toString());
        }

    }
}
