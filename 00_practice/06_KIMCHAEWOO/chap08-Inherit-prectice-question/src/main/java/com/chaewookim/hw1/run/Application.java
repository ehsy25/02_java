package com.chaewookim.hw1.run;

import com.chaewookim.hw1.model.dto.EmployeeDTO;
import com.chaewookim.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        StudentDTO[] studentDTOS = new StudentDTO[3];
        studentDTOS[0] = new StudentDTO(20, 178.2, 70.0, 1, "정보시스템공학과", "홍길동");
        studentDTOS[1] = new StudentDTO(21, 187.3, 80.0, 2, "경영학과", "김말똥");
        studentDTOS[2] = new StudentDTO(23, 167.0, 45.0, 4, "정보통신공학과", "강개순");

        for (StudentDTO i : studentDTOS) {
            System.out.println(i.information());
        }

        System.out.println("=======================");

        EmployeeDTO[] employeeDTOS = new EmployeeDTO[10];
        Scanner sc = new Scanner(System.in);

        int age;
        double height;
        double weight;
        int salary;
        String dept;
        String name;

        char input = 'y';
        int count = 0;

        while (input == 'y') {
            System.out.print("age: ");
            age = sc.nextInt();
            System.out.print("height: ");
            height = sc.nextDouble();
            System.out.print("weight: ");
            weight = sc.nextDouble();
            System.out.print("salary: ");
            salary = sc.nextInt();

            sc.nextLine();

            System.out.print("dept: ");
            dept = sc.nextLine();
            System.out.print("name: ");
            name = sc.nextLine();

            employeeDTOS[count] = new EmployeeDTO(age, height, weight, salary, dept, name);
            count++;

            System.out.print("더 받을래? : ");
            input = sc.next().charAt(0);
        }

        for (int i = 0; i < count; i++) {
            System.out.println(employeeDTOS[i].information());
        }
    }
}
