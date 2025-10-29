package com.lhw.section03.users;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application1 {

    public static void main(String[] args) {

        BufferedReader br = null;
        /*
        * 예외처리를 많이 사용하는 io패키지에서 예외 처리를 사용하는 구문
        * 아직 IO는 학습하지 않았으므로 IO문법보다 try catch블럭의 실제 사용과 흐름에 집중!*/
        try {
            /*FileReader 생성자에 throws FileNotFoundException 이 있으므로
            호출부에서는 예외처리가 강제화 된다. → TryCatch 블럭 사용*/
            br = new BufferedReader(new FileReader("test.txt"));

            String s;
            /*readLine() 메소드에 throws IOException 이 있으므로 예외 처리 강제화*/
            while( (s = br.readLine()) != null ){
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            /*닫아주기*/
            try {
                if (br != null) {
                br.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
