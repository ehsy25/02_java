package com.ohgiraffers.section04.constructor;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        /* 생성자 함수가 무엇인지 이해학 선언 및 호출할 수 있다. */

        /**
         * 생성자 사용 목적
         * 1.인스턴스 생성 시점에 수행할 명령이 있을 경우
         * 2. 매개변수 이쓴 생성자의 경우 매개변수로 전달받은 값으로 필드 초기화할 경우
         * 3. 작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지 않고 싶으 경우
         * => 인스턴스 생성 방법 제한, 초기값 전달 강제화
         */
        Scanner scanner = new Scanner(System.in);

        /*매개변수 생성자:
        * 초기화될 필드가 여러 개 일 경우 초기화하고 싶은 필드의 조합별로
        * 생성자를 여러개 작성할 수 있다.
        **/

        public User(String id, String pwd)
    }
}
