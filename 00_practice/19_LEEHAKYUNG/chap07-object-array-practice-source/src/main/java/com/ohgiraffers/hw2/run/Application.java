package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("학생 정보를 추가하시려면 'y'를 입력하세요: ");
        String input = scanner.nextLine();
        StudentDTO[] stdto = new StudentDTO[10];
        int count = 0;
        while (input.equals("y") || input.equals("Y")) {
            if (count > 9) {
                break;
            }
            stdto[count] = new StudentDTO();

            System.out.print("학년 : ");
            int grade = scanner.nextInt();
            stdto[count].setGrade(grade);

            System.out.print("반 : ");
            int classroom = scanner.nextInt();
            stdto[count].setClassroom(classroom);

            scanner.nextLine();

            System.out.print("이름 : ");
            String name = scanner.nextLine();
            stdto[count].setName(name);

            System.out.print("국어점수 : ");
            int kor = scanner.nextInt();
            stdto[count].setKor(kor);

            System.out.print("영어점수 : ");
            int eng = scanner.nextInt();
            stdto[count].setEng(eng);

            System.out.print("수학점수 : ");
            int math = scanner.nextInt();
            stdto[count].setMath(math);

            count++;

            scanner.nextLine();
            System.out.print("학생 정보를 추가하시려면 'y'를 입력하세요: ");
            input = scanner.nextLine();
        }

        for (int i = 0; i < count; i++) {
            int avgScore = (stdto[i].getKor() + stdto[i].getEng() + stdto[i].getMath()) / 3;
            System.out.println(stdto[i].information() + " 평균점수 : " + avgScore);
        }
    }
}
