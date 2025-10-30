package com.ohgiraffers.exception.auth;

public class Run {
    AuthChecker ac =  new AuthChecker();

    public static void main(String[] args) {
        Run run = new Run();
        run.test6();
    }

    public void test6(){
        try{
            ac.checkAdminPermission("user01",true);
        }catch (PermissionDeniedException e){
            e.printStackTrace();
        }
    }
}
