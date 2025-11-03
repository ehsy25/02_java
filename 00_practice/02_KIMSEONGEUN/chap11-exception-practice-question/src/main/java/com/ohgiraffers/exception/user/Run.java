package com.ohgiraffers.exception.user;

import com.ohgiraffers.exception.file.FileValidator;
import com.ohgiraffers.exception.file.InvalidFileFormatException;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Run run = new Run();
        run.test7();
    }

    public void test7() {

        UserValidator uv =  new UserValidator();

        Scanner sc = new Scanner(System.in);
        System.out.print("아이디를 입력하세요 : ");
        String userId = sc.next();
        System.out.print("이름을 입력하세요 : ");
        String userName = sc.next();

        try {
            uv.validateUserInfo(userId, userName);

        } catch (MissingInfoException e) {
            System.out.println(e.getMessage());
        }
    }
}
