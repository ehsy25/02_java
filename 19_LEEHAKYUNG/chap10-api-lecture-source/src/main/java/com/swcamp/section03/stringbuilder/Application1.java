package com.swcamp.section03.stringbuilder;

public class Application1 {

    public static void main(String[] args) {
        /*
         *  String과 StringBuilder
         *  String : 불변이라는 특성을 가지고 있다.
         *           문자열에 + 연산으로 합치기 하는 경우, 기존 인스턴스를 수정하는 것이 아닌,
         *           새로운 인스턴스를 반환한다.
         *           따라서 문자열 변경이 자주 일어나는 경우 성능 면에서 좋지 않다.
         *           하지만 변하지 않는 문자열을 자주 읽어 들이는 경우에는 오히려 좋은 성능을 기대할 수 있다.
         *  StringBuilder : 가변이라는 특성을 가지고 있다.
         *                  문자열에 append() 메소드를 이용하여 합치기 하는 경우
         *                  기존 인스턴스를 수정하기 때문에 새로운 인스턴스를 생성하지 않는다.
         *                  따라서 잦은 문자열 변경이 일어나는 경우 String보다 성능이 좋다.
         * */

        StringBuilder sb = new StringBuilder("java");
        // toString()해도 주소값이 아닌 실제 내용이 나옴.
        // 이미 override 되어 있는 것임.
        System.out.println("sb : " + sb.toString());
        System.out.println("sb.hashCode() : " + sb.hashCode());
        // 내용이 바뀌어도 새로운 객체가 생성되지 않음.
        sb.append("java");
        System.out.println("sb : " + sb.toString());
        System.out.println("sb.hashCode() : " + sb.hashCode());

        String str = "hello";
        System.out.println(str.hashCode());
        str += "world";
        System.out.println(str.hashCode());
    }
}
