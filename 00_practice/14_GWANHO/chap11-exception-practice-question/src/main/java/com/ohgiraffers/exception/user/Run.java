package com.ohgiraffers.exception.user;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.test9();
    }

    public void test9() {

        try {
            UserValidator uv = new UserValidator();

            //uv.validateUserInfo("admin", "홍길동");
            //uv.validateUserInfo("", "홍길동");
            uv.validateUserInfo("admin", null);

        } catch (MissingInfoException e) {
            System.out.println(e.getMessage());
        }
    }
}
