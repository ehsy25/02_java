package com.ohgiraffers.hw2.model.dto;

import java.util.Scanner;

public class Application {
    public static void main(String[] args){

        StudentDTO[] arr = new StudentDTO[10];
        boolean go = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("add student?");

        int i = 0;
        String input;
        while(i >= 0){
            input = sc.nextLine();
            switch (input){
                case "y":
                case "Y": {
                    System.out.println("Enter grade");
                    int grade =  sc.nextInt();
                    System.out.println("Enter class");
                    int classroom = sc.nextInt();
                    System.out.println("enter name");
                    String name = sc.next();
                    System.out.println("enter gook");
                    int gook = sc.nextInt();
                    System.out.println("enter eng");
                    int eng =  sc.nextInt();
                    System.out.println("enter math");
                    int math = sc.nextInt();

                    arr[i] = new StudentDTO(grade,classroom,name,gook,eng,math);

                    System.out.println("keep adding?");

                    input = sc.nextLine();

                    if(input.equals("y") || input.equals("Y")){
                        i++;
                    }
                    break;
                }
                case "n":{
                    i = -1;
                    break;
                }
            }
        }

        for(int j = 0; j < 4; j++){
            System.out.println("avg score = " + arr[j].avg());
            System.out.println(arr[j].information());
        }
//        if(arr[0]!= null){
//            for(StudentDTO s: arr){
//                if(s.getClass() != null){
//                    System.out.println(s.avg());
//                }
//            }
//            for(StudentDTO s: arr){
//                if(s.getClass() != null){
//                    System.out.println(s.information());
//                    System.out.println(s.avg());
//                }
//
//            }
//        }else System.out.println("nothing added");
    }
}
