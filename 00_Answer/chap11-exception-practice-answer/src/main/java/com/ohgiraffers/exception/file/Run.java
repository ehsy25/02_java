package com.ohgiraffers.exception.file;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        new Run().test7();
    }

    public void test7(){
        Scanner sc = new Scanner(System.in);
        FileValidator fv = new FileValidator();

        System.out.print("검증할 파일 이름을 입력하세요: ");
        String fileName = sc.nextLine();

        try {
            fv.validateExtension(fileName);
        } catch (InvalidFileFormatException e) {
            System.err.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
