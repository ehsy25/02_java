package com.ohgiraffers.section03.use;

import java.io.*;

public class Application1 {
    public static void main(String[] args) {
        /*
        try-with-resource
        JDL 1.7에 추가된 문법이다.

        close해야 하는 인스턴스의 경우 try 앞에 괄호 안에서 생성
        해당 try-catch블럭이완료될 떄 자동으로 close처리

         */
        try(BufferedReader br =new BufferedReader(
                new FileReader("test.txt")
        )){
            String s;
            while((s=br.readLine())!=null){
                System.out.println(s);
            }

        }catch(FileNotFoundException | EOFException e){
            //EOFException> End Of File의 약자
            System.out.println("파일끝");
            throw new RuntimeException(e);
        }catch(IOException e){
            throw new RuntimeException(e);
        }finally{
            System.out.println("나도 아직 살아있어");
        }
    }
}

