package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        StudentDTO[] sd = new StudentDTO[3];
        Scanner sc = new Scanner(System.in);

        sd[0] = new StudentDTO("홍길동", 20, 178.2, 70, 1, "정보시스템공학과");
        sd[1] = new StudentDTO("김말똥", 21, 187.3, 80, 2, "경영학과");
        sd[2] = new StudentDTO("강개순", 23, 167, 45, 4, "정보통신공학과");

        for(StudentDTO sd1 : sd){
            System.out.println(sd1.info());
        }

        EmployeeDTO[] ed = new EmployeeDTO[10];

        int count = 0;
        while(true) {
            System.out.print("이름 : ");
            String name = sc.nextLine();
            System.out.print("나이 : ");
            int age = sc.nextInt();
            System.out.print("키 : ");
            double height = sc.nextDouble();
            System.out.print("몸무게 : ");
            double weight = sc.nextDouble();
            System.out.print("급여 : ");
            int salary = sc.nextInt();
            sc.nextLine();
            System.out.print("부서 : ");
            String dept = sc.nextLine();

            ed[count] = new EmployeeDTO(name, age, height, weight, salary, dept);

            System.out.print("더 추가하시겠습니까 ? ");
            char input = sc.next().charAt(0);
            sc.nextLine();
            count++;
            if(input == 'y' || input  == 'Y') {

            } else {
                break;
            }
        }

//        for(EmployeeDTO i : ed){
//            System.out.println(i.info());
//        }
        for (int i = 0; i < count; i++) {
            System.out.println(ed[i].info());
        }
    }
}
