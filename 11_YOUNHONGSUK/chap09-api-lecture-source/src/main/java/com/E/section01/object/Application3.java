package com.E.section01.object;

import java.util.HashMap;
import java.util.Map;

public class Application3 {

    /*object클래스의 명세에 작성된 일반 규약에 따르면
    * equals() 메소드를 재정의하는 경우 반드시 hashCode()메소드도 재정의하도록
    * 만약 hashCode()를 재정의하지 않으면 같은 값을 가지는 동등객체는
    * 같은 해쉬코드값을 가져야한다는 규약에 위반되기 때문이다
    * (강제성은 없지만 규약대로 작성하는 것이 좋다
    * */

    public static void main(String[] args){
        Book b1 = new Book(1,"홍길동전", "허균", 50000);
        Book b2 = new Book(1,"홍길동전", "허균", 50000);

        System.out.println("b1's hashcode: " + b1.hashCode());
        System.out.println("b2's hashcode: " + b2.hashCode());

        Map<Book, String> map = new HashMap<>();
        map.put(new Book(1,"홍길동전", "허균", 50000), "sold");
        System.out.println(map);

        Book key = new Book(1,"홍길동전", "허균", 50000);

        String value = map.get(key);

        System.out.println(value);

        Book b = new Book();
        Book b5 = new Book(1,"홍길동전", "허균", 50000);

        String str = "java";
        System.out.println(str.hashCode());
        str = str + "oracle";
        System.out.println(str.hashCode());

    }

}
