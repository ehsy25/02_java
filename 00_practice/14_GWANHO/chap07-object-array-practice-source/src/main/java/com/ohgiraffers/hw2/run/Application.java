package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        StudentDTO[] students = new StudentDTO[10];

        Scanner sc = new Scanner(System.in);

        int count = 0;
        while (count < students.length) {

            System.out.println("학생 정보 입력 : ");
            int grade = Integer.parseInt(sc.nextLine());
            int classroom = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            int kor = Integer.parseInt(sc.nextLine());
            int eng = Integer.parseInt(sc.nextLine());
            int math = Integer.parseInt(sc.nextLine());

            students[count++] = new StudentDTO(grade, classroom, name, kor, eng, math);

            System.out.print("계속 입력(Y/N) : ");
            String quit = sc.nextLine();

            if(!(quit.equals("Y") ||  quit.equals("y"))){
                break;
            }
        }


        for(int i = 0; i < count; i++){
            StudentDTO student = students[i];

            int sum = student.getKor() + student.getEng() + student.getMath();
            int avg = sum / 3;

            System.out.println(student.information() + "평균 : " + avg);
        }
    }
}
