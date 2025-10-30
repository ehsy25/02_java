package com.E.section03;

public class Application {

    public static void main(String[] args) {
        /*
         *  이스케이프(escape) 문자
         *  문자열 내에서 사용하는 문자 중 특수문자를 표현하거나 특수기능을 사용할 때 사용하는 문자이다.
         *  이스케이프문자        의미
         *     \n             개행(줄바꿈)
         *     \t                  탭
         *     \'             작은 따옴표
         *     \"               큰따옴표
         *     \\             역슬래쉬 표시
         * */

        System.out.println("\n 힘세고 좋은 아침이다 \n 내가 누군지 묻는다면 나는 왈도");
        System.out.printf("%s\n%s\n", "hello", "mothafuckas");

        /*
         * split 시 이스케이프 문자를 사용해야 하는 특수문자도 존재한다.
         * 이스케이프 문자 사용 안하는 특수문자
         * ~ ` ! @ # % & - _ = ; : ' \ " , < > /
         * 이스케이프 문자를 사용하는 특수문자(\\)
         * $ ^ * ( ) + | { } [ ] . ?
         *
         *
         * (앞에 \\ 붙여야 한다.
         * 정규표현식에서 사용되는 특수문자인 경우 \$가 정규표현식 문자와 겹치게 된다.
         * 따라서 $를 기준으로 split을 하기 위해서는 정규표현식 문자가 아닌 $라는 구분자로 split하겠다는
         * 의미로 사용되려면 구분자를 \$로 표현해야 한다.
         * 하지만 역슬래쉬가 위에서 배운 이스케이프 문자의 역슬래쉬와 겹친다.
         * 따라서 \\$로 해야 역슬래쉬 + $로 인식해서 정규표현식을 탈출하는 탈출문자가 된다.
         * */

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

        System.out.println("sb : " + sb.toString());
        System.out.println(sb.hashCode());
        sb.append("mysql");
        System.out.println("sb : " + sb.toString());
        System.out.println(sb.hashCode());

        /*stringbuilder는 문장에 더해서 한 객체를 유지하지만, string 클래스는 새로운 객체를 만든다
         * 주소값이 달라지는 걸로 확인 가능*/

        String str = "hello";
        System.out.println(str.hashCode());
    }

}
