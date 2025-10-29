package com.ohgiraffers.exception.user;

public class Run {
    public void test9(){
        MissingInfoException mi = new MissingInfoException();
        String id;
        String name;
        try {
            id = null;
            name = null;
            UserValidator uv = new UserValidator();
            uv.validateUserInfo(id, name);
        } catch (MissingInfoException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Run().test9();
    }
}
