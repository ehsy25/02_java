package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.PersonDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentDTO[] studentDTOS = new StudentDTO[3];
        {
            studentDTOS[0] = new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
            studentDTOS[1] = new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과");
            studentDTOS[2] = new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
        }
        for  (StudentDTO studentDTO : studentDTOS) {
            System.out.println(studentDTO.information());
        }

        EmployeeDTO[] employeeDTOS = new EmployeeDTO[10];

        int empCount = 0;
        while(true){
            System.out.print("사원의 정보를 입력하세요 : ");
            String name = sc.next();
            int age = sc.nextInt();
            double height = sc.nextDouble();
            double weight = sc.nextDouble();
            int salary = sc.nextInt();
            String dept = sc.next();

            employeeDTOS[empCount] = new EmployeeDTO(name, age, height, weight, salary, dept);
            empCount++;

            System.out.print("계속 추가하실건가요? (y/n)");
            char op = sc.next().charAt(0);

            if(op=='y' || op=='Y'){
                continue;
            } else {
                System.out.println("프로그램을 종료 합니다.");
                break;
            }
        }

        for ( EmployeeDTO employeeDTO : employeeDTOS) {
            if (employeeDTO == null) {
                continue;
            }
            System.out.println(employeeDTO.information());
        }
    }
}
