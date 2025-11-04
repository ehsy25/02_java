package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        StudentDTO[] students = new StudentDTO[] {
                new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과"),
                new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과"),
                new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신공학과")
        };

        for(StudentDTO student: students){
            System.out.println(student.information());
        }

//        {
//            EmployeeDTO[] employees = new EmployeeDTO[]{
//                    new EmployeeDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과"),
//                    new EmployeeDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과")
//            };
//
//            for(EmployeeDTO employee : employees){
//                System.out.println(employee.information());
//            }
//        }

        Scanner sc = new Scanner(System.in);
        EmployeeDTO[] employees = new EmployeeDTO[10];

        int count = 0;
        while (true) {
            System.out.println("정보 입력 : ");
            String name = sc.nextLine();
            int age = Integer.parseInt(sc.nextLine());
            double height = Double.parseDouble(sc.nextLine());
            double weight = Double.parseDouble(sc.nextLine());
            int salay = Integer.parseInt(sc.nextLine());
            String major = sc.nextLine();

            employees[count++] = new EmployeeDTO(name, age, height, weight, salay, major);
            System.out.print("계속 입력(Y/N) : ");
            String quit = sc.nextLine();

            if(!(quit.equals("Y") ||  quit.equals("y"))){
                break;
            }
        }

        for(int i = 0; i < count; i++){
            System.out.println(employees[i].information());
        }
    }
}
