package com.swcamp.section02.string;

public class Application1 {

    public static void main(String[] args) {

        int[] arr = new int[4];
        System.out.println(arr.length);

        /* length() : 문자열의 길이를 정수형으로 반환 */
        System.out.println("length() : " + "hello".length());       // 5
        System.out.println("empty string's length : " + "".length()); // 0

        /*
        charAt(int index) : 해당 문자열의 특정 인덱스에 해당하는 문자를 반환한다.
        인덱스는 0부터 시작하는 숫자체계를 의미하며
        인덱스를 벗어난 정수를 인자로 전달하는 경우에는 IndexOutOfBoundException이
        발생한다.
         */
        String str1 = "apple";

        for (int i = 0; i < str1.length(); i++) {
            System.out.println("charAt(" + i + ") : " + str1.charAt(i));
        }

        /*
        compareTo() : 인자로 전달된 문자열과 사진 순으로 비교를 하여
        두 문자열이 같다면 0을 반환, 인자로 전달된 문자열보다 작으면 음수를,
        크면 양수를 반환한다.
        단, 이 메소드는 대소문자를 구분하여 비교한다.
         */
        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";

        System.out.println("compareTo() : " + str2.compareTo(str3));
        // j=106, J=74 | a=97, A=65 >>> 소문자-대문자 간 32 차이.
        // 비교시 맨 첫글자의 차이가 반환됨.
        System.out.println("compareTo() : " + str2.compareTo(str4));    // 32
        System.out.println("compareTo() : " + str4.compareTo(str2));    // -32 (str4:J - str2:j)
        System.out.println("compareTo() : " + str2.compareTo(str5));    // -5

        /*
        compareToIgnoreCase() : 대소문자를 구분하지 않고 비교
         */
        System.out.println("compareToIgnoreCase() : " + str2.compareToIgnoreCase(str4));

        /*
        concat() : 문자열에 인자로 전달된 문자열을 합치기해서 새로운 문자열을 반환한다.
        원본 문자열에는 영향을 주지 않는다.
         */
        System.out.println("concat() : " + str2.concat(str5));

        /*
        indexOf() : 문자열에서 특정 문자를 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 반환한다.
        단, 일치하는 문자가 없는 경우 -1을 반환한다.
        >>> charAt()과의 비교: charAt(정수인덱스) <-> indexOf(한문자)
         */
        String indexOf = "java mariadb";
        System.out.println("indexOf('a') : " + indexOf.indexOf("a")); // 1
        System.out.println("indexOf('z') : " + indexOf.indexOf("z"));

        /*
        lastIndexOf() : indexOf()의 작업을 문자열 뒤에서부터 하는 함수.
         */
        System.out.println("indexOf('a') : " + indexOf.lastIndexOf("a")); // 9

        /*
        trim() : 문자열의 앞 뒤에 공백을 제거한 문자열을 반환한다.
         */
        String trimStr = "    java   ";
        System.out.println("trimStr() : " + trimStr);
        System.out.println("trimStr() : " + trimStr.trim());

        /*
        toLowerCase(), toUpperCase()
         */
        String casStr = "JavaMariaDB";
        System.out.println("casStr() : " + casStr.toLowerCase());
        System.out.println("casStr() : " + casStr.toUpperCase());

        /*
        substring() : 문자열의 일부를 잘라내어 새로운 문자열을 반환한다.
         */
        String javamysql = "javamysql";
        System.out.println("substring(3, 6) : " + javamysql.substring(3, 6));
        System.out.println("suvstring(3) : " + javamysql.substring(3));

        /*
        isEmpty() : 문자열의 길이가 0이면 true반환
         */
        String emptyStr = "";
        System.out.println("emptyStr() : " + emptyStr.isEmpty());

    }
}
