package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {

    public static void main(String[] args) {
        File file = new File("src/main/java/com/ohgiraffers/section01/file/test.txt");

        try{
            boolean exists = file.createNewFile();

            // 최초 실행하면 새롭게 파일이 만들어지기 때문에 true를 반환한다.
            // 파일이 한 번 생성되고 난 이후는 새롭게 파일을 만들지 않기 때문에 false를 반환
            System.out.println("exists = " + exists);

        }catch (IOException e){
            throw new RuntimeException(e);
        }

        System.out.println("파일의 크기 : " +file.length() +"byte");
        System.out.println("파일의 경로 : " + file.getPath());
        System.out.println("현재 파일의 상위 경로 : " + file.getParent());
        System.out.println("현재 파일의 절대 경로 : " + file.getAbsolutePath());

    }
}
