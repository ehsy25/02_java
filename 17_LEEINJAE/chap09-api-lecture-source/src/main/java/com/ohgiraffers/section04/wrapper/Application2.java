package com.ohgiraffers.section04.wrapper;

public class Application2 {

    public static void main(String[] args) {

        // parsing: 문자열(string) 값을 기본자료형 값으로 변경하는 것을 parsing이라고 한다.
        byte b = Byte.parseByte(s: "1");
        int i = Integer.parseInt(s: "4");       // <----- 얘는 꼭 기억
        long l = Long.parseLong(s: "8");        // 8L, 8l은 안 됨
        float f = Float.parseFloat(s: "4.0f");      // 3.14f는 됨
        double d = Double.parseDouble(s: "8.0");
        boolean bool = Boolean.parseBoolean(s: "true");


    }
}
