package com.ohgiraffers.exception.auth;

import java.util.Scanner;

public class Run {
    public void test6(){

        AuthChecker ac = new AuthChecker();
        String user = "user01";
        boolean isAdmin = false;

        try {
            ac.checkAdminPermission(user, isAdmin);
        } catch (PermissionDeniedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Run().test6();
    }
}
