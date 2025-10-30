package com.chaewookim.exception.file;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        Run run = new Run();

        run.test7();
    }

    public void test7() {

        Scanner sc = new Scanner(System.in);
        FileValidator fv = new FileValidator();

        String input = "";

        System.out.print("파일명 입력: ");
        input = sc.nextLine();

        try {
            fv.validateExtension(input);
        } catch (InvalidFileFormatException e) {
            e.printStackTrace();
        }
    }
}
