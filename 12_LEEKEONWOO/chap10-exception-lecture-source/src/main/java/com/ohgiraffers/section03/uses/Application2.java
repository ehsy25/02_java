package com.ohgiraffers.section03.uses;

import java.io.*;

public class Application2 {

    public static void main(String[] args) {
        /*
        * try-with-resource
        * JDK 1.7에 추가된 문법이다.
        *
        * close 해야 하는 인스턴스의 경우 try 앞에 괄호 안에서 생성하면
        * 해당 try-catch블럭이 완료될때 자동으로
        * close처리해준다
        * */
        try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {

            String s;

            while ((s = br.readLine()) != null) {
                System.out.println(s);
            } // finally 축약
        } catch (FileNotFoundException | EOFException e) {
    // EOFException => End Of File 의 약자
            System.out.println("파일끝!");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            System.out.println("나도아직 살아있어~");
        }
    }

}
