package com.ohgiraffers.section01.level01.example;
<<<<<<<< HEAD:00_practice/10_YOOCHANYEON/chap03-method-and-api-practice-question/src/main/java/com/ohgiraffers/section01/level01/example/ExampleTest.java

import java.util.Scanner;
========
>>>>>>>> 42e230d40e02d2cd1fd7af28d0746cc717a2bce2:00_practice/chap03-method-and-api-practice-question/src/main/java/com/ohgiraffers/section01/level01/example/ExampleTest.java

public class ExampleTest {
    Scanner sc = new Scanner(System.in);

    /*
    메소드명 : evenOdd(int value)
    반환형 : void
    사용자로부터 정수하나를 입력받아
    해당 숫자가 짝수인지 홀수인지 판별하세요.

    --- 출력 예시 ---
    짝수입니다

    홀수입니다
    * */
    public void evenOdd(int value) {
        String result = (value % 2 == 0)? "짝" : "홀";
        System.out.println(result);
    }

    /*
    * 메소드명 : findMax(int first, int second)
    * 리턴타입 : void
    * 두 수중 더 큰수 찾기
    * 사용자로부터 정수 두개를 입력받아 더큰수를 출력
    * */
    public void findMax(int first, int second) {
        String result = (first > second)? first + "가 더 큼" : (second > first)? second + "가 더 큼" : "똑같네";
        System.out.println(result);
    }

    /*
    * 메소드명 randomMathQuiz(int num1, int num2)
    * 리턴타입 : void
    * 1~10 사이의 임의의 정수 2개를 생성
    * 사용자에게 "num1 + num2 = ?" 뭘까라고 질문
    * 사용자로부터 정답을 입력받는다.
    * 사용자의 답이 실제 정답과 일치하는지 판별하고 결과를 출력
    *
    * -- 출력 예시
    * 정답입니다!
    *
    * 틀렸습니다 정답은 2 입니다.
    * */

    public void randomMathQuiz(){

        int num1 = (int)(Math.random() * 10) + 1;
        int num2 = (int)(Math.random() * 10) + 1;
        System.out.println(num1 + " 더하기 " + num2 + "는 뭐게?");
        int sum = num1 + num2;
        int answer = sc.nextInt();
        String result = (answer == sum)? "올? 정답" : "푸하하~ 땡! 🤣🤣🤣 " + sum + "이잖슴!!";
        System.out.println(result);
    }
}
