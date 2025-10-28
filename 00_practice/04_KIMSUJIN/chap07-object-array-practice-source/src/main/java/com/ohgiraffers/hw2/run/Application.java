package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        // 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
        StudentDTO [] studentArr = new StudentDTO[10];

        // while문을 사용하여 학생들의 정보를 계속 입력 받고
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        while(true){
            // 인원 10명 제한
            if (cnt == 10){break;
            } else {
                // 1. 인원 추가 할건지 우선 물어보기
                System.out.print("인원 추가 할거임?");
                String input = sc.nextLine();
                // 2. 인원 추가할 때
                if(input.equals("y") ||  input.equals("Y")){
                    studentArr[cnt] = new StudentDTO();
                    // 2-1. 학년입력
                    System.out.print("학년 : ");
                    int grade  = sc.nextInt();
                    studentArr[cnt].setGrade(grade);
                    // 2-2. 반 입력
                    System.out.print("반 : ");
                    int name  = sc.nextInt();
                    studentArr[cnt].setClassroom(name);
                    //2-3. 이름 입력
                    System.out.print("이름 입력 : ");
                    String name1 = sc.next();
                    studentArr[cnt].setName(name1);
                    //2-4. 국어점수
                    System.out.print("국어 점수: ");
                    int kor = sc.nextInt();
                    studentArr[cnt].setKor(kor);
                    //2-5. 영어점수
                    System.out.print("영어 점수: ");
                    int eng = sc.nextInt();
                    studentArr[cnt].setEng(eng);
                    //2-6. 수학점수
                    System.out.print("수학점수 : ");
                    int mat = sc.nextInt();
                    studentArr[cnt].setMat(mat);

                    cnt++;

                    sc.nextLine();
                }else {
                    //인원추가 안할때
                    System.out.println("인원추가 종료함");
                    break;
                }
            }
        }
        // 한 명씩 추가 될 때마다 카운트함
        // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가

        // 3명 정도의 학생 정보를 입력 받아 각 객체에 저장함
        // 현재 기록된 학생들의 각각의 점수 평균을 구함
        for(StudentDTO student: studentArr){
            if(student != null){
                int sumScore = student.getKor() + student.getEng() + student.getMat();
                int avgScore = sumScore / 3;
                System.out.println(student.getName() + avgScore);
            }
        }

        // 학생들의 정보를 모두 출력 (평균 포함)

        for(StudentDTO student: studentArr){
            if(student != null) {
                System.out.println(student.Information());
            }
        }
    }
}
