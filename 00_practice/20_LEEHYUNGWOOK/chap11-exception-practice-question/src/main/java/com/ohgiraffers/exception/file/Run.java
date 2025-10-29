package com.ohgiraffers.exception.file;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.test7();
    }

    private void test7() {
        FileValidator fileValidator = new FileValidator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the path to the file: ");
        String path = scanner.nextLine();
        try {
            fileValidator.validateExtension(path);
        } catch (InvalidFileFormatException e) {
            System.out.println(e.getMessage());
        }
    }

}
