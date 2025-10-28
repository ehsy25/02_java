package com.ohgiraffers.operatorPractice;

public class Application2o {

    public static void main(String[] args) {

        /*
         * 임의의 정수 한개를 선언하고 해당 숫자가 13세 이하이면 어린이, 13세초과 ~ 19세 이하이면
         * 청소년, 19세 초과이면 성인이라고 출력되도록 작성하세요
         *
         * 19
         *
         * ------ 출력 결과 --------
         * 청소년
         * */
        int num1 = 19;
        String result1 = (num1 <= 13)? "어린이":(num1 <= 19)? "청소년":"성인";
        System.out.println("이 사람은 " + result1 + "입니다.");
        // 강사님 풀이
        int age = 13;

        String result = (age <= 13)? "어린이" : (age > 19)? "성인": "청소년";
        System.out.println(result);

        int num = 25;
        System.out.println((num<=13)? "어린이": (num<=19)?"청소년":"성인");

    }
}
