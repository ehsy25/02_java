package com.ohgiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Application1 {

    public static void main(String[] args) {
        /*
        * 예외처리를 많이 사용하는 io패키지에서 예외 처리를 사용하는 구문
        * 아직 IO는 학습하지 않았으므로 IO문법보다 try catch블럭의 실제 사용과 흐름에 집중
        * */
        BufferedReader br = null;

        try {
            /*
            * FileReader 생성자에 throws FileNotFoundException이 있으므로
            * 호출부에서는 예외처리가 강제화된다 ---> try catch 블럭 사용
            * */
            br = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
