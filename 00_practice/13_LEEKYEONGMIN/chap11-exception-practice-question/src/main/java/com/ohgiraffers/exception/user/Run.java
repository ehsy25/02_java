package com.ohgiraffers.exception.user;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.test9();

    }
    public void test9(){
        try{
            String ID = "";
            String Name = null;
            UserValidator uv = new UserValidator();
            uv.validateUserInfo(ID, Name);
        }catch(MissingInfoException e){
            System.out.println(e.getMessage());
        }
    }
}
