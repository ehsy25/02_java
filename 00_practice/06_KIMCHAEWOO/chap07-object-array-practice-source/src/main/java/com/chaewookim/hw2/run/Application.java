package com.chaewookim.hw2.run;

import com.chaewookim.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentDTO[] sarr = new StudentDTO[10];
        double[] avg = new double[10];

        Scanner sc = new Scanner(System.in);

        char input = 'y';
        int count = 0;
        while (input == 'y' || input == 'Y') {
            System.out.print("학년: ");
            int grade = sc.nextInt();
            System.out.print("classroom: ");
            int classroom = sc.nextInt();
            sc.nextLine();
            System.out.print("name: ");
            String name = sc.nextLine();
            System.out.print("kor: ");
            int kor = sc.nextInt();
            System.out.print("eng: ");
            int eng = sc.nextInt();
            System.out.print("math: ");
            int math = sc.nextInt();

            avg[count] = (math + kor + eng) / 3.0;

            System.out.print("계속?: ");
            input = sc.next().charAt(0);

            sarr[count] = new StudentDTO(grade, classroom, name, kor, eng, math);

            count++;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(sarr[i].information() + " avg: " + avg[i]);
        }





    }
}
