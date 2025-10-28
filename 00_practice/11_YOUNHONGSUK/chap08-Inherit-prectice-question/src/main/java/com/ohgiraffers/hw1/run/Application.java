package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.PersonDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        PersonDTO[] pa = new PersonDTO[3];

        pa[0] = new StudentDTO(20, 178.2, 70.0, 1, "정보시스템공학과");
        pa[1] = new StudentDTO(21 ,187.3 ,80.0, 2, "경영학과");
        pa[2] = new StudentDTO(23 ,167.0 ,45.0 ,4 ,"정보통신공학과");

        pa[0].setName("홍길동");
        pa[1].setName("김말똥");
        pa[2].setName("강개순");

        for(PersonDTO p: pa){
            System.out.println(p.info());
        }

        PersonDTO[] pa1 = new PersonDTO[10];

        Scanner sc = new Scanner(System.in);

        boolean go = true;
        while(go){
            int count = 0;

            System.out.println("name");
            String name = sc.next();
            System.out.println("age");
            int age = sc.nextInt();
            System.out.println("height");
            double height = sc.nextDouble();
            System.out.println("weight");
            double weight = sc.nextDouble();
            System.out.println("salary");
            double salary = sc.nextDouble();
            System.out.println("dept");
            String dept = sc.next();


            System.out.println("keep adding?");
            String keep = sc.next();
            switch(keep){
                case "y" :
                case "Y": {
                    count++;
                    break;
                }
                case "n" :
                case "N": {
                    go = false;
                    break;
                }
            }

            for(int i=0; i<=count-1; i++){
                System.out.println(pa1[i].info());
            }
        }
    }
}
