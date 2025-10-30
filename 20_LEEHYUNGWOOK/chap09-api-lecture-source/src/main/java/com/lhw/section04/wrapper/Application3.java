package com.lhw.section04.wrapper;

public class Application3 {

    public static void main(String[] args) {

        /*parse 와 반대로 기본자료형 값을 문자열로 바꾸는 경우*/

        /*valueOf()*/
        String b = Byte.valueOf((byte) 1).toString();
        String s = Short.valueOf((short) 1).toString();
        String i = Integer.valueOf(1).toString();
        String f = Float.valueOf(1f).toString();
        String d = Double.valueOf(1d).toString();
        String bool = Boolean.valueOf("true").toString();

    }
}
