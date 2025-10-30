package com.E.secion03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application1 {

    public static void main(String[] args) {

        //BufferedReader br = null;

        /*filereader 생성자에 throws FileNotFoundException이 있으므로
        * 호출부에서는 예외처리가 강제화된다 try catch 사용*/

        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
            String s;
            /* readLine() 메소드에 throws IOexception이 있으므로 예외 처리 강제화
            * */
            while((s = br.readLine()) != null){
                System.out.println(s);
            }

        } catch (FileNotFoundException/* | EOFException*/ e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
//        }finally {
//            try{
//                if(br!= null){
//                    br.close();
//                }
//            } catch (IOException e){
//                throw new RuntimeException(e);
//            }
//        }

    }

}}
