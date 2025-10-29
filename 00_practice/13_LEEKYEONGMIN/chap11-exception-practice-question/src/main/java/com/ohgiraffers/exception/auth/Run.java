package com.ohgiraffers.exception.auth;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.test6();
    }
    public void test6(){
        try {
//            String id = "user01";
//            boolean isAdmin = true;
            String id = "guest99";
            boolean isAdmin = false;
            AuthChecker authChecker = new AuthChecker();
            authChecker.checkAdminPermission(id, isAdmin);
        } catch (PermissionDeniedException e) {
            System.out.println(e.getMessage());
        }
    }
}
