package com.sekong.hw1.run;

import com.sekong.hw1.model.dto.EmployeeDTO;
import com.sekong.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDTO[] studentDTO = new StudentDTO[10];
        int count1 = 0;
        int count2 = 0;
        boolean flag1 = true;
        boolean flag2 = true;
        EmployeeDTO[] employeeDTO = new EmployeeDTO[10];
        do {
            employeeDTO[count1] = new EmployeeDTO();
            System.out.println("===Employee details===");
            System.out.print("Name : ");
            String name = sc.nextLine();
            System.out.print("Age : ");
            int age = sc.nextInt();
            System.out.print("Height : ");
            int height = sc.nextInt();
            System.out.print("Weight : ");
            int weight = sc.nextInt();
            System.out.print("Salary : ");
            int salary = sc.nextInt();
            sc.nextLine();
            System.out.print("Department : ");
            String dept = sc.nextLine();
            employeeDTO[count1] = new EmployeeDTO();
            employeeDTO[count1].setName(name);
            employeeDTO[count1].setAge(age);
            employeeDTO[count1].setHeight(height);
            employeeDTO[count1].setWeight(weight);
            employeeDTO[count1].setSalary(salary);
            employeeDTO[count1].setDept(dept);
            count1++;
            System.out.print("계속 입력하시겠습니까?(Y) ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            if (ch == 'Y') {
                if(count1 == 10) {
                    System.out.println("최대 10명까지 입력 가능합니다.");
                    flag1 = false;
                }
            } else {
                flag1 = false;
            }

        }while(flag1);


          do{
              studentDTO[count2] = new StudentDTO();
              System.out.println("===Student details===");
              System.out.print("Name : ");
              String name = sc.nextLine();
              System.out.print("Age : ");
              int age = sc.nextInt();
              System.out.print("Height : ");
              int height = sc.nextInt();
              System.out.print("Weight : ");
              int weight = sc.nextInt();
              System.out.print("Grade : ");
              int grade = sc.nextInt();
              sc.nextLine();
              System.out.print("Major : ");
              String major = sc.nextLine();

              studentDTO[count2] = new StudentDTO();
              studentDTO[count2].setName(name);
              studentDTO[count2].setAge(age);
              studentDTO[count2].setHeight(height);
              studentDTO[count2].setWeight(weight);
              studentDTO[count2].setGrade(grade);studentDTO[count2].setMajor(major);
              count2++;
              System.out.print("계속 입력하시겠습니까?(Y) ");
              char ch = sc.next().charAt(0);
              sc.nextLine();
              if(ch == 'Y'){
                  if(count2==10){
                      System.out.println("최대 10명까지 입력 가능합니다.");
                      flag2 = false;
                  }
              }else{
                  flag2 = false;
              }
          }while(flag2);

        for(int i = 0;i<count1;i++){
            System.out.println(employeeDTO[i].information());
        }
        for(int i = 0;i<count2;i++){
            System.out.println(studentDTO[i].information());
        }








    }
}
