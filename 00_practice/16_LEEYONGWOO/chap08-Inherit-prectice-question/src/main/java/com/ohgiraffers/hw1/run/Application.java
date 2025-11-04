package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentDTO[] st=new StudentDTO[3];
        st[0]=new StudentDTO("홍길동",20,178.2,70.0,1,"정보시스템공학과");
        st[1]=new StudentDTO("김말똥",21,187.3,80.0,2,"경영학과");
        st[2]=new StudentDTO("강개순",23,167.0,45.0,4,"정보통신공학과");

        for(StudentDTO s:st){
            System.out.println(s.information());
        }


        System.out.println();
        System.out.println("사원 정보");

        Scanner sc=new Scanner(System.in);
        EmployeeDTO[] em=new EmployeeDTO[10];
        int cnt=0;
        do{
            System.out.print("name: ");
            String name=sc.next();

            System.out.print("age: ");
            int age=sc.nextInt();

            System.out.print("height: ");
            double height=sc.nextDouble();

            System.out.print("weight: ");
            double weight=sc.nextDouble();

            System.out.print("salary: ");
             int salary=sc.nextInt();

            System.out.print("dept: ");
            String dept=sc.next();

            em[cnt]=new EmployeeDTO(name,age,height,weight,salary,dept);

            cnt++;

            System.out.println("계속 추가하시겠습니까?(Y/N) : ");
            String yn=sc.next();
            if(yn.equals("N")||yn.equals("n")){
                break;
            }

        }while(true);

       for(int i=0;i<cnt;i++){
           System.out.println(em[i].information());
       }
    }
}
