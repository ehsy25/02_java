package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

public class ExamClass {
    public static void main(String[] args) {
        // 경로 src/main/java/com/ohgiraffers/section01/logs/app

        // 생성한 경로에 오늘 날짜로 파일을 생성하고
        // 해당 파일을 열어서 아무 글자나 입력

        // 현재 경로, 상위 폴더경로, 파일의 사이즈 출력

       String route = "src/main/java/com/ohgiraffers/section01/logs/app/";

        try{
            File file1 = new File(route);
            file1.mkdirs();
            route += LocalDate.now().toString() + ".txt";
            File file = new File(route);
            file.createNewFile();

        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
