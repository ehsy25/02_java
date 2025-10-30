package com.swcamp.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application1 {

    public static void main(String[] args) {

        BufferedReader br = null;

        try {
            /*
            FileReader 생성자에 throws FileNotFoundException이 있으므로
            호출부에서는 예외처리가 강제화된다 ---> try catch 블럭 사용
             */
            br = new BufferedReader(new FileReader("test.txt"));

            String s;
            /*
            readLine() 메소드에 throws IOException이 있으므로 예외 처리 강제화
             */
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            /*
            오류가 발생하거나 발생하지 않거나 무조건 동작해야 하는 구문
            일반적으로 IO에서는 사용한 자원을 반납하는 용도로 사용한다.
             */
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
