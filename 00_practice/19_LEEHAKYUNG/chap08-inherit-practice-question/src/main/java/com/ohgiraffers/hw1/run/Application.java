package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        /*
        1. StudentDTO
         */
        StudentDTO[] stDTO = new StudentDTO[3];
        stDTO[0] = new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        stDTO[1] = new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        stDTO[2] = new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
        for (StudentDTO st : stDTO){
            System.out.println(st.information());
        }


        /*
        2. EmployeeDTO
         */
        EmployeeDTO[] empDTO = new EmployeeDTO[10];
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print(">>>사원정보를 추가하시려면 'y'를 입력하세요: ");
        String input = sc.nextLine();
        while (true) {
            if (!(input.equals("y") || input.equals("Y"))) {
                break;
            }
            if (count == 10) {
                System.out.println("사원정보DTO를 새로 만드십시오. 10명이 다 찼습니다.");
                break;
            }
            System.out.print("이름을 입력하세요: ");
            String name = sc.nextLine();
            System.out.print("나이를 입력하세요: ");
            int age = sc.nextInt();
            System.out.print("신장을 입력하세요: ");
            double height = sc.nextDouble();
            System.out.print("몸무게를 입력하세요: ");
            double weight = sc.nextDouble();
            System.out.print("급여를 입력하세요: ");
            int salary = sc.nextInt();
            sc.nextLine();
            System.out.print("부서를 입력하세요: ");
            String dept = sc.nextLine();

            empDTO[count] = new EmployeeDTO(name, age, height, weight, salary, dept);
            count++;

            System.out.print(">>>사원정보를 추가하시려면 'y'를 입력하세요: ");
            input = sc.nextLine();
        }

        System.out.println("===== 현재 사원 정보 출력 =====");
        for (int i = 0; i < count; i++) {
            System.out.println(empDTO[i].information());
        }
    }
}
