package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        StudentDTO[] students = new StudentDTO[10];

        int[] avg = new int[10];
        int count = 0;

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("학년 : ");
            int grade = sc.nextInt();

            System.out.print("반 : ");
            int classRoom = sc.nextInt();
            sc.nextLine();

            System.out.print("이름 : ");
            String name = sc.next();

            System.out.print("국어 점수 : ");
            int kor = sc.nextInt();

            System.out.print("영어 점수 : ");
            int eng = sc.nextInt();

            System.out.print("수학 점수 : ");
            int math = sc.nextInt();
            sc.nextLine();

            students[count++] = new StudentDTO(grade, classRoom, name, kor, eng, math);

            System.out.print("더 입력 하시겠습니까? (y/n) : ");
            char answer = sc.next().charAt(0);

            for (int i = 0; i < count; i++) {
                avg[i] = ((students[i].getKor() + students[i].getEng() + students[i].getMath()) / 3);
            }

            if (answer != 'y' && answer != 'n') {
                System.out.println("====== 학생 정보 출력 ======");
                for (int i = 0; i < count; i++) {
                    System.out.println(students[i].information() + ", " + avg[i]);
                }
                break;
            }

            if (count == students.length) {
                System.out.println("10명 까지만 입력 가능합니다.");
                break;
            }

        }
    }
}
