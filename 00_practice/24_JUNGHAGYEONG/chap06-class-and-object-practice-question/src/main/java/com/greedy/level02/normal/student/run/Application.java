package com.greedy.level02.normal.student.run;

import com.greedy.level02.normal.student.modell.vo.StudentVO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        //스캐너로 학생 정보를 모두 입력 받아 모든 필드를 초기화하는 생성자로 인스턴스 생성 후
        //모든 필드 정보를 출력하는 printInformation() 메소드 호출하여 출력

        Scanner scanner = new Scanner(System.in);

        StudentVO studentVO = new StudentVO();
        System.out.print("학년 : ");
        studentVO.setGrade(scanner.nextInt());
        scanner.nextLine();
        System.out.print("반 : ");
        studentVO.setClassroom(scanner.nextInt());
        scanner.nextLine();
        System.out.print("이름 : ");
        studentVO.setName(scanner.nextLine());
        System.out.print("키: ");
        studentVO.setHeight(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("성별 : ");
        studentVO.setGender(scanner.next().charAt(0));
        studentVO.printInformation();
    }
}
