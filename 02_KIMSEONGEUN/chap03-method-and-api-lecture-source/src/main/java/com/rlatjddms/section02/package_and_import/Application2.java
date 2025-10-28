package com.rlatjddms.section02.package_and_import;

import com.rlatjddms.section02.package_and_import.test.Calculator;

//import static com.rlatjddms.section01.method.Calculator.maxNumberOf;
//import static com.rlatjddms.section01.method.Calculator.minNumberOf;
import static com.rlatjddms.section01.method.Calculator.*;

public class Application2 {

    public static void main(String[] args) {

        // non-static-method
        Calculator cal= new Calculator();
        int result = cal.plusTwoNumbers(10, 20);
        System.out.println("result = " + result);

        int result2 = Calculator.maxNumberOf(10,20); // static 메소드 사용방법 1 (클래스명으로 시작)
        System.out.println("result2 = " + result2);

        int result3 = maxNumberOf(10,20); // static 메소드 사용방법2 (import static을 이용해서)
        System.out.println("result3 = " + result3);

        int result4 = minNumberOf(10,20);
        System.out.println("result4 = " + result4);

        com.rlatjddms.section01.method.Calculator cal2
                = new com.rlatjddms.section01.method.Calculator();
        int result5 = cal2.plusTwoNumbers(10, 20);
        System.out.println("result5 = " + result5);
    }
}
