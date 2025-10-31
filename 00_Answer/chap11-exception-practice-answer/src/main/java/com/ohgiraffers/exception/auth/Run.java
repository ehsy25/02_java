package com.ohgiraffers.exception.auth;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        new Run().test6();
    }

    public void test6() {
        Scanner sc = new Scanner(System.in);
        AuthChecker ac = new AuthChecker();

        System.out.print("사용자 ID를 입력하세요: ");
        String userId = sc.nextLine();
        System.out.print("관리자 권한 여부 (true/false)를 입력하세요: ");
        boolean isAdmin = sc.nextBoolean();

        try {
            ac.checkAdminPermission(userId, isAdmin);
        } catch (PermissionDeniedException e) {
            System.err.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
