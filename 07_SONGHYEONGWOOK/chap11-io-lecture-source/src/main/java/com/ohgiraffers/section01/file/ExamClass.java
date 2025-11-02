package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExamClass {

    public static void main(String[] args) {

        // 경로 : src/main/java/com/ohgiraffers/section01/logs/app

        // 생성한 경로에 오늘 날짜로 파일을 생성하고
        // 해당파일을 열어서 아무 글자나 입력

        // 현재 경로, 상위 폴더경로, 파일의 사이즈 출력

        /* 저장할 폴더를 생성 */
        String basePath = "src/main/java/com/ohgiraffers/section01/logs/app";
        File baseFolder = new File(basePath);
        boolean mkdirs = baseFolder.mkdirs();
        System.out.println("mkdirs = " + mkdirs);

        // 생성한 경로에 오늘 날짜로 파일(20251030.txt)을 생성하고
        // 해당 파일을 열어서 아무 글자나 입력
        String today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        String fileName = today + ".txt";

        File todayFile = new File(basePath + File.separator + fileName);
        try {
            boolean newFile = todayFile.createNewFile();
            System.out.println("newFile = " + newFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 현재 경로, 상위 폴더경로, 파일의 사이즈 출력
        System.out.println("파일의 크기 (length()) : " + todayFile.length() + "byte");
        System.out.println("파일의 경로 (getPath()) : " + todayFile.getPath());
        System.out.println("현재 파일의 상위 경로 (getParent()) : " + todayFile.getParent());
        System.out.println("파일의 절대경로 (getAbsolutePath()) : " + todayFile.getAbsolutePath());
    }
}
