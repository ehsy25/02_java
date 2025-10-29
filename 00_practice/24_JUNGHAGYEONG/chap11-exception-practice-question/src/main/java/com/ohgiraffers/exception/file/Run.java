package com.ohgiraffers.exception.file;

import java.util.Scanner;

public class Run {

    public void test7() {

        FileValidator fv = new FileValidator();
        Scanner sc = new Scanner(System.in);
        System.out.print("파일 이름을 작성 해주세요 : ");
        String fileName = sc.next();

        try {
            fv.validateExtension(fileName);
        } catch (InvalidFileFormatException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        new Run().test7();
    }
}
