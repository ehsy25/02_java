package com.lhw.section02.string;

public class Application1 {

    public static void main(String[] args) {

        int[] arr = new int[4];
        System.out.println(arr.length);

        /*문자열의 길이를 정수형으로 반환*/
        System.out.println("\"hello\".length() = " + "hello".length());
        System.out.println("빈 문자열의 길이 : " + "".length());

        /*
        * charAt(int index) :
        * 해당 문자열의 특정 인덱스에 해당하는 문자를 반환한다.
        * 인덱스는 0부터 시작하는 숫자 체계를 의미하며 인덱스를
        * 벗어난 정수를 인자로 전달하는 경우에는
        * IndexOutOfBoundsException이 발생한다.
        * */
//        String str1 = "apple";
//        for (int i = 0; i < str1.length(); i++) {
//            System.out.println(str1.charAt(i));
//        }

        /*
        * compareTo():인자로 전달된 문자열과 사전 순으로 비교를
        * 하여 두 문자열이 같다면 0 을 반환, 인자로 전달된 문자열보다 작으면 음수를,
        * 크면 양수를 반환한다.
        * 단, 이 메소드는 대소문자를 구분하여 비교한다.
        * */
        System.out.println("=================");
        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";
        System.out.println("str2.compareTo(str3)) : " + (str2.compareTo(str3)));
        // j: 106 J: 74 a:97 A:65 => 32차이
        System.out.println("str2.compareTo(str4) : " + str2.compareTo(str4));
        // j: 106 o: 111 -> 5 차이
        System.out.println("str2.compareTo(str5) = " + str2.compareTo(str5));

        /*compareToIgnoreCase(): 대소문자를 구분하지 않고 비교한다*/
        System.out.println("str3.compareToIgnoreCase(str4) = " + str3.compareToIgnoreCase(str4));

        /*concat*/
        System.out.println(str2.concat(str3));

        System.out.println("==================");
        /*indexOf*/
        String indexOf = "java mariadb";
        System.out.println(indexOf);
        System.out.println("indexOf.indexOf('a') = " + indexOf.indexOf('a'));
        System.out.println("indexOf.indexOf('z') = " + indexOf.indexOf('z'));

        /*lastindexof*/;
        System.out.println(indexOf);
        System.out.println("lastIndexOf.indexOf('a') = " + indexOf.lastIndexOf('a'));

        /*trim*/
        String trimStr = "         Java       ";
        System.out.println("trimStr + \"#\" = " + trimStr + "#");
        System.out.println("trimStr + \"#\" = " + trimStr.trim() + "#");

        /*toLowerCase*/
        String castStr = "JavaMariaDB";
        System.out.println("castStr.toLowerCase() = " + castStr.toLowerCase());
        System.out.println("castStr.toUpperCase() = " + castStr.toUpperCase());
        
        /*substring*/
        String javamysql = "javamysql";
        System.out.println("javamysql.substring(3,6) = " + javamysql.substring(3,6));
        System.out.println("javamysql = " + javamysql.substring(3));

        /*replace*/

        /*isEmpty*/
        System.out.println("isEmpty: " + "".isEmpty());
        System.out.println("isEmpty: " + "hi".isEmpty());

    }
}
