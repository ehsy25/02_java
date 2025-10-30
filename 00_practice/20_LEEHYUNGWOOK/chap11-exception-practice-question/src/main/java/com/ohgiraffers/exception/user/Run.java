package com.ohgiraffers.exception.user;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.test7();

    }

    private void test7() {
        Scanner sc = new Scanner(System.in);
        UserValidator userValidator = new UserValidator();

        System.out.print("ID를 입력하시오 : ");
        String id = sc.nextLine();
        System.out.print("이름을 입력하시오 : ");
        String name =  sc.nextLine();
        try {
            userValidator.validateUserInfo(id,name);
        } catch (MissingInfoException e) {
            System.out.println(e.getMessage());
        }
    }
}
