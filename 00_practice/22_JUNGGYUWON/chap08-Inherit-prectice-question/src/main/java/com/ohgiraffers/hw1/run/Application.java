package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentDTO[] students = new StudentDTO[3];
        students[0] = new StudentDTO("홍길동",20,178.2,70.0,1,"정보시스템공학과");
        students[1] = new StudentDTO("김말똥", 21, 187.3,80.0,2,"경영학과");
        students[2] = new StudentDTO("강개순",23,167.0,45.0,4,"정보통신공학과");

        System.out.println("이름 | 나이 | 신장 | 몸무게 | 학년 | 전공");
        for (StudentDTO student : students) {
            System.out.println(student.information());
        }

        System.out.println();

        EmployeeDTO[] employees = new EmployeeDTO[10];

        int count = 0;
        boolean flag = true;
        do {
            System.out.print("이름을 입력하세요 : ");
            String name = sc.nextLine();

            System.out.print("나이를 입력하세요 : ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("신장을 입력하세요 : ");
            double height = sc.nextDouble();
            sc.nextLine();

            System.out.print("몸무게를 입력하세요 : ");
            double weight = sc.nextDouble();
            sc.nextLine();

            System.out.print("급여를 입력하세요 : ");
            int salary = sc.nextInt();
            sc.nextLine();

            System.out.print("부서를 입력하세요 : ");
            String dept = sc.nextLine();

            employees[count] = new EmployeeDTO(name, age, height, weight, salary, dept);
            count++;
            System.out.print("계속 하시려면 대소문자 상관없이 y를 눌러주세요 : ");
            char choice = sc.next().charAt(0);
            sc.nextLine();

            if(choice == 'y'|| choice == 'Y'){

            }
            else{
                flag = false;
            }


        }
        while (flag);

        System.out.println();
        System.out.println("이름 | 나이 | 신장 | 몸무게 | 학년 | 전공");

        for(int i = 0; i< count; i++){
            System.out.println(employees[i].information());
        }
    }
}
