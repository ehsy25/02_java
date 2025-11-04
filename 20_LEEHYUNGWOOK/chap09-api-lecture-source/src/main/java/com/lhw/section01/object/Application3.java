package com.lhw.section01.object;

import com.lhw.section01.object.book.Book;

import java.util.HashMap;
import java.util.Map;

public class Application3 {

    public static void main(String[] args) {

        /*
        *
        * */
        Book book1 = new Book(1, "홍", "허", 5);
        Book book2 = new Book(1, "홍", "허", 5);

        System.out.println("boook1.hashCode() = " + book1.hashCode());
        System.out.println("book2 = " + book2.hashCode());

        Map<Book, String> map = new HashMap<>();
        map.put(new Book(1,"홍","허",500),"sold");
        System.out.println(map);

        /* 여기서 새로 객체를 선언한다면 주소값이 다를 것이다. 하지만
            하지만 주소값이 다르다면, map에 들어간 주소값과 달라서 매치되지 않을 것이다.
            따라서 값이 같다면, 동일객체로 판단하여, key값이 들어가면, 일치하는 값을
            찾아가도록 이용할 수 있다.
            만약 이때 equals와 hashcode를 오버라이딩 한것을 주석처리하면
            map의 결과는 null이 된다.
        */
        Book key = new Book(1,"홍","허",500);
        System.out.println(map.get(key));
    }
}
