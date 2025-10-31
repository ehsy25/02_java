package com.ohgiraffers.exception.file;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Run run = new Run();
        run.test6();
    }

    public void test6() {

        FileValidator fv =  new FileValidator();

        Scanner sc = new Scanner(System.in);
        System.out.print("파일 이름을 입력하세요 : ");
        String fileName = sc.next();

        try {
            fv.validateExtension(fileName);

        } catch (InvalidFileFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
