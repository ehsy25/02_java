package com.ohgiraffers.exception.auth;

import java.util.Scanner;

public class Run {
    public void test6(){
        AuthChecker ac = new AuthChecker();
        Scanner sc = new Scanner(System.in);
        System.out.print("사용자 Id입력 : ");
        String str = sc.nextLine();
        System.out.print("권한 입력 : ");
        boolean tr = sc.nextBoolean();
        try{
            ac.checkAdminPermission(str,tr);
        }
        catch (PermissionDeniedException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Run().test6();
    }
}
