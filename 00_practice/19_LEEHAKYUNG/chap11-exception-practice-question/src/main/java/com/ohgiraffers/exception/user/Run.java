package com.ohgiraffers.exception.user;

public class Run {
    public void test7() {
        UserValidator uv = new UserValidator();
        try {
            uv.validateUserInfo("admin", "홍길동");

        } catch (MissingInfoException e) {
            System.out.println(e.getMessage());
        }
        try {
            uv.validateUserInfo("", "홍길동");
        } catch (MissingInfoException e) {
            System.out.println(e.getMessage());
        }
        try {
            uv.validateUserInfo("admin", null);
        } catch (MissingInfoException e) {
            System.out.println(e.getMessage());
        }
        try {
            uv.validateUserInfo("", null);
        } catch (MissingInfoException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Run run = new Run();
        run.test7();
    }
}
