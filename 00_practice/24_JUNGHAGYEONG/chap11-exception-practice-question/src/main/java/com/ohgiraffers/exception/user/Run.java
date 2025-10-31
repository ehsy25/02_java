package com.ohgiraffers.exception.user;

import java.util.Scanner;

public class Run {

    public void test9() {

        UserValidator uv = new UserValidator();
        Scanner sc = new Scanner(System.in);
        System.out.print("아이디를 입력하세요 : ");
        String userId = sc.nextLine();
        System.out.print("이름을 입력하세요 : ");
        String userName = sc.nextLine();

        try {
            uv.validateUserInfo(userId, userName);
        } catch (MissingInfoException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        new Run().test9();
    }
}
