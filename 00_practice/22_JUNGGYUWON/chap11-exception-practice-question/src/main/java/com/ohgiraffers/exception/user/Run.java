package com.ohgiraffers.exception.user;

public class Run {
    UserValidator uv = new UserValidator();

    public static void main(String[] args) {
        Run run = new Run();
        run.test9();
    }

    public void test9(){
        try{
            uv.validateUserInfo("admin","홍길동");
        }
        catch(MissingInfoException e){
            e.printStackTrace();
        }
    }
}
