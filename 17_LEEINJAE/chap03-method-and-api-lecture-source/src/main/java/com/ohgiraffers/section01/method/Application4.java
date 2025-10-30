package com.ohgiraffers.section01.method;

public class Application4 {

    public static void main(String[] args) {

        Application4 app = new Application4();
        // 이름, 나이, 성별을 입력받아서 "당신의 이름은 xxx이고, 나이는 XX 세이며, 성별은 XX입니다"를 출력하는메소드
        app.testMethodA("홍길동", 20, '남');
        app.testMethodA("유관순", 16, '여');

        String name = "신사임당";
        int age = 40;
        char gender = '여';
        app.testMethodA(name, age, gender);
    }

    public void testMethodA(String name, int age,final char gender) {
        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세 이며, 성별은 " + gender + "입니다.");
    }
}
