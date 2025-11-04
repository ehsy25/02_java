package com.ohgiraffers.exception.user;

import java.util.Scanner;

public class Run {
    public void test9(){
        Scanner sc = new Scanner(System.in);
        UserValidator userValidator = new UserValidator();
        System.out.print("ID입력하세요 : ");
        String id = sc.nextLine();
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        try{
            userValidator.validateUserInfo(id,name);
        }catch(Exception e){
            System.out.println(e.getMessage());

        }
    }

    public static void main(String[] args) {
        new Run().test9();
    }
}
