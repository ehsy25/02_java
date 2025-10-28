package com.ohgiraffers.hw2.run;
import com.ohgiraffers.hw2.model.dto.StudentDTO;
import java.util.Scanner;


public class Application {
    public static void main(String[] args) {

        // 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
        // while문을 사용하여 학생들의 정보를 계속 입력 받고
        // 한 명씩 추가 될 때마다 카운트함
        // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가

        // 3명 정도의 학생 정보를 입력 받아 각 객체에 저장함
        // 현재 기록된 학생들의 각각의 점수 평균을 구함
        // 학생들의 정보를 모두 출력 (평균 포함)
        Scanner sc = new Scanner(System.in);
        StudentDTO[] students = new StudentDTO[10];
        int count = 0;

        /// ////////////여기서 while/do /////////////////
        while (true) {// 계속 반복이니까 true

            System.out.println("입력해주세요");

            System.out.println("학년");
            int grade = sc.nextInt();

            System.out.println("반");
            int classroom = sc.nextInt();

            System.out.println("이름");
            String name = sc.next();

            System.out.println("국어점수");
            int kor = sc.nextInt();

            System.out.println("영어점수");
            int eng = sc.nextInt();

            System.out.println("수학점수");
            int math = sc.nextInt();

            students[count] = new StudentDTO(grade, classroom, name, kor, eng, math);
            count++;

// 3명의 학생 정보가 입력되면 종료를 묻는다.                                  // 요 뒷부분은.. 제미나이의 많은 도움을 받았습니다
            if (count >= 3) {
                System.out.print("계속 추가하시겠습니까? (y/n): ");
                sc.nextLine(); // 버퍼 정리
                String answer = sc.nextLine();

                if (!answer.equalsIgnoreCase("y")) {
                    break; // 'y'가 아니면 반복문 종료
                }
            }
        }

        System.out.println("\n===== 현재 기록된 학생 정보 및 평균 점수 출력 =====");
        // 현재 기록된 학생들의 정보를 모두 출력 (평균 포함)
        for (int i = 0; i < count; i++) {
            System.out.println(students[i].information());
        }

        sc.close();
    }
}