package com.ohgiraffers.exception.auth;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Run {
    Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        Run run = new Run();
        run.test6();
    }

    public void test6(){

        Map<String,Boolean> info=new HashMap<>();
        info.put("user1",true);
        info.put("user2",false);


        System.out.print("사용자 아이디 입력 : ");
        String user1=sc.nextLine();
        AuthChecker authChecker = new AuthChecker();


        Boolean isAdmin=info.get(user1);
        if(isAdmin==null){
            System.out.println("존재 x"+user1);
            return;
        }

        try{
            authChecker.checkAdminPermission(user1,info.get(user1));
        }catch(PermissionDeniedException e){
            System.out.println(e.getMessage());
        }

    }
}
