package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;

public class Examclass {
    public static void main(String[] args) {
        String path = "src/main/java/com/ohgiraffers/section01/logs/app";
        File file1 = new File(path);
        boolean mkdirs = file1.mkdirs();
        System.out.println("mkdirs = " + mkdirs);
        // 경로 ; src/main/java/com/ohgiraffers/section01/logs/app
        File file = new File("src/main/java/com/ohgiraffers/section01/logs/app/20251030.txt");
        try {
            boolean createSuccess = file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // 생성한 경로에 오늘 날짜로 파일을 생성하고
        // 해당 파일을 열어서 아무 글자나 입력

        // 현재 경로, 상위 폴더경로, 파일의 사이즈 출력
        System.out.println("현재 경로 : " + file.getPath());
        System.out.println("상위 폴더 경로 : " + file.getParent());
        System.out.println("파일의 사이즈 : " + file.length() + "byte");

    }
}
