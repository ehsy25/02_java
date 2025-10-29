package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
        // while문을 사용하여 학생들의 정보를 계속 입력 받고
        // 한 명씩 추가 될 때마다 카운트함
        // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
        StudentDTO student = new StudentDTO();
        StudentDTO[] studentDTOs = new StudentDTO[10];
        int count = 0;

        while (count <= 10) {

            Scanner sc = new Scanner(System.in);
            System.out.print("학년 : ");
            int grade = sc.nextInt();
            System.out.print("반 : ");
            int classroom = sc.nextInt();
            System.out.print("이름 : ");
            String name = sc.next();
            System.out.print("국어점수 : ");
            int kor = sc.nextInt();
            System.out.print("영어점수 : ");
            int eng = sc.nextInt();
            System.out.print("수학점수 : ");
            int math = sc.nextInt();

            studentDTOs[count] = new StudentDTO(grade, classroom, name, kor, eng, math);
            count++;

            System.out.println("****** " + count + "명의 학생 추가 ******");
            String menu = """
                    ============= 학생 등록 프로그램 =============
                    계속 추가 하시겠습니까? (y/n)
                    ==========================================
                    선택 :  """;
            System.out.print(menu);
            char yn = sc.next().charAt(0);
            if (yn != 'y' && yn != 'Y') {
                System.out.println(student.getStudentInformation());
                System.out.println("프로그램 종료."); break;
            }

            for(int i = 0; i < count; i++){
                StudentDTO studentDTO = studentDTOs[i];
            }

        }
    }
}


