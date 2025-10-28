package com.ohgiraffers.section02.pacakage_and_import;

import com.ohgiraffers.section02.pacakage_and_import.test.Calculator;

//import static com.ohgiraffers.section01.method.Calculator.maxNumbersOf;
//import static com.ohgiraffers.section01.method.Calculator.minNumbersOf;
import static com.ohgiraffers.section01.method.Calculator.*;

public class Application2 {

    public static void main(String[] args) {

        // non-static-method
        Calculator cal = new Calculator();
        int ressult = cal.plusTwoNumbers(10, 20);
        System.out.println("ressult = " + ressult);
        
        // static-method
        int result2 = Calculator.maxNumbersOf(10, 20);
        System.out.println("result2 = " + result2); // static 메소드 사용방법 1(클래스명으로 시작)
        
        int result3 = maxNumbersOf(10, 20); // import static 이용해서
        System.out.println("result3 = " + result3);

        int result4 = minNumbersOf(10,20);

        com.ohgiraffers.section01.method.Calculator cal2 = new com.ohgiraffers.section01.method.Calculator();
        int result5 = cal2.maxNumbersOf(10,20);
        
    }
}
