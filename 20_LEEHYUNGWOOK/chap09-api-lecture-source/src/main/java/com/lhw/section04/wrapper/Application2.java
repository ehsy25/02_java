package com.lhw.section04.wrapper;

public class Application2 {

    public static void main(String[] args) {

        /*parsing*/
        byte b = Byte.parseByte("1");
        short s = Short.parseShort("2");
        int i = Integer.parseInt("4"); // 중요
        long l = Long.parseLong("8"); //8L 8l 안됨
        float f = Float.parseFloat("3.14f");
        double d = Double.parseDouble("3.14");
        boolean bool = Boolean.parseBoolean("true");
        String c = Character.valueOf('a').toString(); // 'a' => "a"

        /*String 클래스의 valueOf를 사용*/
        String str = String.valueOf(10);

        /*문자열 합치기를 통해 String 변환*/
        String str2 = 123 + "";

    }
}
