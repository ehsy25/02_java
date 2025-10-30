package com.chaewookim.exception.user;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        Run run = new Run();
        run.test9();
    }

    public void test9() {

        Scanner sc = new Scanner(System.in);
        UserValidator uv = new UserValidator();

        String id;
        String name;

        System.out.print("아이디: ");
        id = sc.nextLine();
        System.out.print("이름: ");
        name = sc.nextLine();

        try {
            uv.validateUserInfo(id, name);
        } catch (MissingInfoException e) {
            e.printStackTrace();
        }
    }
}
