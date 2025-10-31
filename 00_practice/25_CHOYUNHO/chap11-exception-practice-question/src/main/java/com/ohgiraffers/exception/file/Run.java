package com.ohgiraffers.exception.file;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Run {
    public void test7(){
        FileValidator fileValidator = new FileValidator();
        Scanner sc = new Scanner(System.in);
        System.out.print("파일 이름을 입력: ");
        String str = sc.nextLine();
        try{
            fileValidator.validateExtension(str);
        }catch(InvalidFileFormatException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {

    }
}
