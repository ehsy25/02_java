package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;

public class ExamClass {

    public static void main(String[] args) {

        // 경로 : src/main/java/com/ohgiraffers/section01/logs/app

        String path = "c:\\한화시스템 Beyond SW캠프_21기\\dev\\02_java\\18_LEEJIHEANG\\chap11-io-lecture-source\\src\\main\\java\\com\\ohgiraffers\\section01\\logs\\app";
        File filePath = new File(path);
        boolean mkdirs = filePath.mkdirs();

        //
        // 생성한 경로에 오늘 날짜로 파일을 생성하고
        // 해당파일을 열어서 아무 글자나 입력
        File file = new File("c:\\한화시스템 Beyond SW캠프_21기\\dev\\02_java\\18_LEEJIHEANG\\chap11-io-lecture-source\\src\\main\\java\\com\\ohgiraffers\\section01\\logs\\app\\2025-10-30.txt");

        try {
            // 파일 생성 후 성공/실패 여부를 boolean으로 리턴(생성되면 true)
            boolean createSuccess = file.createNewFile();

            // 최초 실행하면 새롭게 파일이 만들어지기 때문에 true를 반환한다.
            // 파일이 한 번 생성되고 난 이후는 새롭게 파일을 만들지 않기 때문에 false를 반환
            System.out.println("createSuccess = " + createSuccess);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // 현재 경로, 상위 폴더경로, 파일의 사이즈 출력
        System.out.println("파일의 크기 : " + file.length() + "byte");
        System.out.println("파일의 경로 : " + file.getPath());
        System.out.println("현재 파일의 상위 경로 : " + file.getParent());
        System.out.println("파일의 절대경로 : " + file.getAbsolutePath());


    }
}
