package com.ohgiraffers.exception.auth;

import java.util.Scanner;

public class Run {

    public void test6() {

        AuthChecker ac = new AuthChecker();
        Scanner sc = new Scanner(System.in);
        System.out.print("아이디를 입력해주세요 : ");
        String userId = sc.nextLine();
        System.out.print("권한 여부를 입력하세요(true/false) : ");
        boolean isAdmin = sc.nextBoolean();

        try {
            ac.checkAdminPermission(userId, isAdmin);
        } catch (PermissionDeeniedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Run().test6();
    }
}
