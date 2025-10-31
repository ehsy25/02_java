package com.ohgiraffers.exception.user;

public class Run {

    public static void main(String[] args) {
        Run run = new Run();
        run.test9();
    }

    public void test9() {

        String[][] users = {
                {"admin", "홍길동"},
                {null, "홍길동"},
                {"user1", ""},
                {null, ""}
        };

        UserValidator validator = new UserValidator();

        for (String[] user : users) {
            String id = user[0];
            String name = user[1];
            System.out.println("검증 중: ID=" + id + ", 이름=" + name);
            try {
                validator.validateUserInfo(id, name);
            } catch (MissingInfoException e) {
                System.out.println(e.getMessage());
            }
            System.out.println();
        }
    }
}
