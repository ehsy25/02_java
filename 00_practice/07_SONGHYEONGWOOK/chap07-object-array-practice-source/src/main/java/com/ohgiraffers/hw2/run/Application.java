package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDTO[] sDto = new StudentDTO[10];

        int grade = 0;
        int classroom = 0;
        String name = "";
        int kor = 0;
        int eng = 0;
        int math = 0;

        int index = 0;

        while(index < sDto.length) {
            System.out.print("학년 : ");
            grade = sc.nextInt();

            System.out.print("반 : ");
            classroom = sc.nextInt();

            System.out.print("이름 : ");
            name =  sc.next();

            System.out.print("국어점수 : ");
            kor = sc.nextInt();

            System.out.print("영어점수 : ");
            eng = sc.nextInt();

            System.out.print("수학점수 : ");
            math = sc.nextInt();

            sDto[index] = new StudentDTO(grade, classroom, name, kor, eng, math);
            index++;

            System.out.print("계속 추가 하시겠습니까? : ");
            char answer = sc.next().charAt(0);
            if(answer == 'y' || answer == 'y'){
                continue;
            } else { break; }
        }

        for(int i = 0; i < index; i++){
            System.out.println(sDto[i].information());
        }

    }

}
