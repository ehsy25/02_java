package com.ohgiraffers.exception.user;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        new Run().test9();
    }

    public void test9(){
        Scanner sc = new Scanner(System.in);
        UserValidator uv = new UserValidator();

        System.out.print("사용자 ID를 입력하세요 (null 또는 빈 문자열 허용): ");
        String userId = sc.nextLine();


        System.out.print("사용자 이름을 입력하세요 (null 또는 빈 문자열 허용): ");
        String userName = sc.nextLine();

        try {
            uv.validateUserInfo(userId, userName);
        } catch (MissingInfoException e) {
            System.err.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
