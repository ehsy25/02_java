package com.ohgiraffers.section03.filterstream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Application3 {

    public static void main(String[] args) {

        /*
        * 외부 데이터로부터 읽어오는 데이터를 바이트형 정수, 문자, 문자열로만 읽어오면
        * 여러 데이터 타입을 취급하는 경우 별도로 처리를 해줘야한다.
        * 예) 정수 입력받아 처리하려면 parsing을 해줘야한다.
        * "1" ====================> 1 : parsing
        * */
        DataOutputStream dout = null;

        dout = new DataOutputStream(new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/score.txt"));
    }
}
