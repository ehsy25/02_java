package com.ohgiraffers.section02.pacakage_and_import;

// import 등록을 생략해도 사용가능한 패키지가 있음
// " java.lang "
// 워낙 기본이 되는 패키지이다보니, 생략해도 컴파일러가 알아서 실행할때 추가 함.
import com.ohgiraffers.section02.pacakage_and_import.test.Calculator;

public class Application1 {

    public static void main(String[] args) {

        Calculator cal = new Calculator();
//        import 안쓰고 불러오는 방법
//        com.ohgiraffers.section02.pacakage_and_import.test.Calculator cal
//        = new com.ohgiraffers.section02.pacakage_and_import.test.Calculator();

        int plusResult = cal.plusTwoNumbers(100,50);
        System.out.println("plusResult = " + plusResult);

        int maxResult = com.ohgiraffers.section01.method.Calculator.maxNumbersOf(100,50);
        // non-static이나 static 둘다 풀 패키지명을 쓰면 따로 기재 안해도 됨
        System.out.println("maxResult = " + maxResult);
    }
}
