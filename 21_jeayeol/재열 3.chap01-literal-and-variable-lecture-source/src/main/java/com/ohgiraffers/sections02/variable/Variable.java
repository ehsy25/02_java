package com.ohgiraffers.sections02.variable;

public class Variable {
    public static void main(String[] args) {
        System.out.println("============값에 의미 부여를 테스트");
        System.out.println("보너스를 포함한 급여:" + (10000000 + 20000) + "원");
        // 값은 알지만 뭐가 월급인지 모름

        int sal = 10000000;  // 대입 연산자 기준으로 왼쪽 오른쪾 값은 같아야하고정수가 가지고 있는 리터럴값은 10000000 기본 자료형은 int 타입이므로 가능
        int bonus = 200000;
        System.out.println("보너스를 포함한 급여:" + (sal + bonus) + "원");


        System.out.println("변수에 저장한 값 재사용 테스트 ======================");
        System.out.println("1번고객에게 100포인트 지급 하였습니다");
        System.out.println("2번고객에게 100포인트 지급 하였습니다");
        System.out.println("3번고객에게 100포인트 지급 하였습니다");
        System.out.println("4번고객에게 100포인트 지급 하였습니다");
        System.out.println("5번고객에게 100포인트 지급 하였습니다");

        System.out.println(); // 공백 한줄 추가 기능
        int point = 300;
        System.out.println("1번고객에게"+point+"포인트 지급 하였습니다");
        System.out.println("2번고객에게"+point+"포인트 지급 하였습니다");
        System.out.println("3번고객에게"+point+"포인트 지급 하였습니다");
        System.out.println("4번고객에게"+point+"포인트 지급 하였습니다");
        System.out.println("5번고객에게"+point+"포인트 지급 하였습니다");

        //3. 시간에 따라  변경 돠는 값을 저장하고 사용할 목적
        System.out.println("========== 변수에 저장한 값 변경 테스트");
        int sum = 0;
        sum = sum + 10; // 왼쪽에 있는 현재 sum 값은 0임 오른쪽 sum 은 0과 10을 더한 결과를 sum 변수에 저장하는 상황"
        sum = sum + 10; //20
        sum = sum + 10; //30
        sum = sum + 10; //40
        sum = sum + 10; //50
        //왼쪽은 공간 오른쪽은 값
        System.out.println("sum에 10을 더하면 sum의 값은? = "+sum);


    }
}
