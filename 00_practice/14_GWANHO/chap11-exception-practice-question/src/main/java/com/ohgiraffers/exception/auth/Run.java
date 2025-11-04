package com.ohgiraffers.exception.auth;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.test6();
    }

    public void test6() {

        try {
            AuthChecker ac = new AuthChecker();
            ac.checkAdminPermission("root", false);
        } catch (PermissionDeniedException e) {
            System.out.println(e.getMessage());
        }
    }
}
