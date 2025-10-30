package com.ohgiraffers.section04;

public class Application2 {
    //parsing: 문자열(string)값을 기본자료형 값으로 변경하는 것을 parsing이라고 한다.
    byte b=Byte.parseByte("1");
    short s=Short.parseShort("2");
    int i=Integer.parseInt("3");//꼭 기억
    long l=Long.parseLong("4");//8L, 8l은 안됨
    float f=Float.parseFloat("3.14f");//3.14f는 됨
    double d=Double.parseDouble("8.0");
    boolean bool=Boolean.parseBoolean("true");

    char c="abc".charAt(0);

}
