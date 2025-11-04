package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDTO[] st = new StudentDTO[3];
        EmployeeDTO[] em = new EmployeeDTO[10];
        int count = 0;
        int exit = 0;

        st[0] = new StudentDTO("홍길동", 20, 178.2, 70.0, 1 ,"정보시스템공학과");
        st[1] = new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        st[2] = new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
        for(StudentDTO s : st) {
            System.out.println(s.toString());
        }
        while(exit != 2) {
            System.out.print("1을 입력하면 사원정보를 추가 2를 입력하면 종료 : ");
            exit = sc.nextInt();
            if (exit == 1) {
                sc.nextLine();

                System.out.print("이름: ");
                String name = sc.nextLine();

                System.out.print("나이: ");
                int age = sc.nextInt();

                System.out.print("몸무게: ");
                double weight = sc.nextDouble();

                System.out.print("키: ");
                double height = sc.nextDouble();

                System.out.print("연봉: ");
                int salary = sc.nextInt();
                sc.nextLine();
                System.out.print("부서: ");
                String dept = sc.nextLine();
                em[count++] = new EmployeeDTO(name, age, weight, height, salary, dept);
                System.out.println("현재 추가된 인원 : " + (count));
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(em[i].toString());
        }

    }
}
