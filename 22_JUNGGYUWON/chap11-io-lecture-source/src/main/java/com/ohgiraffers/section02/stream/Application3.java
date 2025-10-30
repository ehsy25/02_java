package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {


    public static void main(String[] args) {
        FileOutputStream fout = null;

        try {
            //OutputStream은 파일이 존재 하지 않으면 파일을 생성한다.

            //두번째 인자로 true를 전달하면 이어쓰기
            // flase는 이어쓰기가 아닌 덮어쓰기이며 기본값은 false
            fout = new FileOutputStream("src/main/java/com/ohgiraffers/section02/stream/testOutputStream.txt");
            fout.write(97);
            byte[] barr = new byte[]{98,99,100,101,102,10,103};
            //10: 개행문자
            fout.write(barr);
            fout.write(barr,1,3);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
