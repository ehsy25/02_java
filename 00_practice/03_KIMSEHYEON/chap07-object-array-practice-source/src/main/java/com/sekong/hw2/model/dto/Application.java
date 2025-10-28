package com.sekong.hw2.model.dto;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        StudentDTO[] stu =  new StudentDTO[10];
        Scanner sc = new Scanner(System.in);
        int count = 0;
        char answer = 'y';
        while(answer=='y'||answer=='Y')
        {
            stu[count] = new StudentDTO();

            System.out.print("grade : ");
            int grade = sc.nextInt();
            stu[count].setGrade(grade);

            System.out.print("classroom : ");
            int classroom = sc.nextInt();
            stu[count].setClassroom(classroom);
            sc.nextLine();
            System.out.print("name : ");
            String name = sc.nextLine();
            stu[count].setName(name);

            System.out.print("kor : ");
            int kor = sc.nextInt();
            stu[count].setKor(kor);
            System.out.print("eng : ");
            int eng = sc.nextInt();
            stu[count].setEng(eng);
            System.out.print("math : ");
            int math = sc.nextInt();
            stu[count].setMath(math);
            sc.nextLine();

            System.out.print("계속 추가하겠습니까? ");
            answer = sc.next().charAt(0);
            count++;


        }
        for(int i = 0; i < count;i++){
            System.out.println(stu[i].getName() +"의 평균 : " + (stu[i].getEng()+stu[i].getKor()+stu[i].getMath()/3));
        }
        for(int i = 0; i < count;i++){
            System.out.println(stu[i].information());
        }
    }


}
