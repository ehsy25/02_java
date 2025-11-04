package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.PersonDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        StudentDTO stu[] = new StudentDTO[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<stu.length;i++){
            System.out.print("이름 : ");
            String name = sc.nextLine();
            System.out.print("나이 : ");
            int age = sc.nextInt();
            System.out.print("신장 : ");
            double height = sc.nextDouble();
            System.out.print("몸무게 : ");
            double weight = sc.nextDouble();
            System.out.print("학년 : ");
            int grade = sc.nextInt();
            sc.nextLine();
            System.out.print("전공 : ");
            String major = sc.nextLine();
            System.out.println("====================================================");
            stu[i] = new StudentDTO(name,age,height,weight,grade,major);
        }
        for(StudentDTO i : stu){
            String str = i.information();
            System.out.println(str);
        }

        EmployeeDTO[] emp = new EmployeeDTO[10];
        int count = 0;
        while(true){
            System.out.println("====================================================");
            System.out.print("이름 : ");
            String name = sc.nextLine();
            System.out.print("나이 : ");
            int age = sc.nextInt();
            System.out.print("신장 : ");
            double height = sc.nextDouble();
            System.out.print("몸무게 : ");
            double weight = sc.nextDouble();
            System.out.print("급여 : ");
            int salary = sc.nextInt();
            sc.nextLine();
            System.out.print("부서 : ");
            String dept = sc.nextLine();
            emp[count] =new EmployeeDTO(name,age,height,weight,salary,dept);
            System.out.println("계속 추가하시겠습니까? ");
            char ch =sc.nextLine().charAt(0);
            count++;
            if(ch == 'y')
                continue;
            else
                break;

        }
        for (int i = 0; i < count; i++) {
            System.out.println(emp[i].information());
        }


    }
}
