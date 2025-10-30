package com.ohgiraffers.exception.auth;

import com.ohgiraffers.exception.array.ArrayLengthException;
import com.ohgiraffers.exception.array.ArrayProcessor;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Run run = new Run();
        run.test5();
    }

    public void test5() {

        AuthChecker ac =  new AuthChecker();

        Scanner sc = new Scanner(System.in);
        System.out.print("아이디를 입력하세요 : ");
        String userId = sc.next();
        System.out.print("권한 여부를 입력하세요 : ");
        boolean admin = sc.nextBoolean();

        try {
            ac.checkAdminPermission(userId, admin);

        } catch (PermissionDeniedException e) {
            System.out.println(e.getMessage());
        }
    }
}
