package com.chaewookim.exception.auth;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        Run run = new Run();
        run.test6();
    }

    public void test6() {

        Scanner sc = new Scanner(System.in);
        AuthChecker ac = new AuthChecker();

        boolean isAdmin;
        String userId;

        System.out.print("아이디 입력: ");
        userId = sc.nextLine();
        System.out.print("권한 입력: ");
        isAdmin = sc.nextBoolean();

        try {
            ac.checkAdminPermission(userId, isAdmin);
        } catch (PermissionDeniedException e) {
            e.printStackTrace();
        }
    }
}
