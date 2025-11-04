package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentDTO[] dtos = new StudentDTO[10];

        int countStudents = 0;
        System.out.print("학생정보를 입력하시겠습니까?");
        char op = sc.next().charAt(0);
        while (op == 'y' || op == 'Y') {
            System.out.print("정보를 입력해주세요: ");
            int grade = sc.nextInt();
            int classroom = sc.nextInt();
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();

            dtos[countStudents] = new StudentDTO(grade, classroom, name, kor, eng, math);
            countStudents++; //학생 수 추가
            System.out.println("입력이 모두 완료 되었습니다.");
            System.out.print("학생 정보를 계속 입력하시겠습니까?");
            op = sc.next().charAt(0);
        }

        // 평균 구하기
        int[] avg = new int[countStudents]; // 학생 수 만큼 평균담는 배열생성
        for (int i = 0; i < countStudents; i++) {
           int totalSum = 0;
           totalSum = dtos[i].getKor() + dtos[i].getEng() + dtos[i].getMath();
           avg[i] = (int) totalSum/3;
        }

        // 학생들의 정보를 모두 출력 (평균 포함)
        for (int i = 0; i < countStudents; i++) {
            System.out.println(dtos[i].information() + ", 평균: " + avg[i] + ']' +"\n");
        }
    }
}
