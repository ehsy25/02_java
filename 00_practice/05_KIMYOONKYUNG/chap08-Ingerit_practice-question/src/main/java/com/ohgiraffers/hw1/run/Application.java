package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;
import java.util.Scanner;


public class Application {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("1.학생 정보");

            StudentDTO[] students = new StudentDTO[3];


            students[0] = new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
            students[1] = new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과");
            students[2] = new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");


            for (StudentDTO s : students) {
                System.out.println(s.information());
            }

            System.out.println("\n2.사원 정보 ");


            EmployeeDTO[] employees = new EmployeeDTO[10];

            int count = 0;


            while (true) {
                if (count >= employees.length) {
                    System.out.println("10명 까지 가능");
                    break;
                }

                System.out.println("\n--- " + (count + 1) + "번째 사원 정보 입력 ---");

                System.out.print("이름: ");
                String name = sc.nextLine();

                System.out.print("나이: ");
                int age = sc.nextInt();

                System.out.print("신장: ");
                double height = sc.nextDouble();

                System.out.print("몸무게: ");
                double weight = sc.nextDouble();

                System.out.print("급여: ");
                int salary = sc.nextInt();
                sc.nextLine(); // 버퍼 비우기

                System.out.print("부서: ");
                String dept = sc.nextLine();


                employees[count] = new EmployeeDTO(name, age, height, weight, salary, dept);
                count++;


                System.out.print("계속 추가할 것 입니까?(y/n): ");
                String answer = sc.nextLine();

                if (!answer.equalsIgnoreCase("y")) {
                    break;
                }
            }

            System.out.println("\n 사원 정보 (" + count + "명) ---");
            for (int i = 0; i < count; i++) {
                System.out.println(employees[i].information());
            }

            sc.close();
        }
    }
