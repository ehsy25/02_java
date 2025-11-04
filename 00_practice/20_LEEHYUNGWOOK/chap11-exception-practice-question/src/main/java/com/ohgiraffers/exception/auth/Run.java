package com.ohgiraffers.exception.auth;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Run run =  new Run();
        run.test6();
    }

    public void test6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID를 입력하세요 : ");
        String id = sc.nextLine();
        System.out.print("관리자 여부를 true/false로 입력하세요 : ");
        boolean auth = sc.nextBoolean();

        AuthChecker authChecker = new AuthChecker();
        try {
            authChecker.checkAdminPermission(id, auth);
        } catch (PermissionDeniedException e) {
            System.out.println(e.getMessage());
        }
    }
}
