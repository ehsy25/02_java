package com.ohgiraffers.exception.auth;

public class Run {

    public void test6() {
        AuthChecker ac = new AuthChecker();
        try {
            ac.checkAdminPermission("user01", true);
            ac.checkAdminPermission("guest99", false);
        } catch (PermissionDeniedException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Run run = new Run();
        run.test6();
    }
}
