package com.ohgiraffers.section01.method;

public class Application4 {

    public static void main(String[] args) {

        Application4 app = new Application4();
        // 이름, 나이, 성별을 입력받아서 "당신의 이름은 XXX이고, 나이는 XX 세 이며, 성별은 XX입니다"를 출력하는 메소드
        app.testMethodA("홍길동", 20, '남');
        app.testMethodA("유관순", 15, '여');

        String name = "신사임당";
        int i = 48;
        char gender= '여';
        app.testMethodA(name, i, gender);
    }

    public void testMethodA(String name, int i, final char gender) {
        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + i + "세 이며, 성별은 " + gender + "입니다");
    }
}
