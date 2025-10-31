package com.E.section01.list.run;

import java.util.*;

public class Application1 {

    public static void main(String[] args) {

        /*컬렉션 프레임워크
        * 자바에서 컬렉션 프레임워크는 여러 개의 다양한 데이터들을 쉽고 효과적으로 처리할 수 있도록
        * 표준화된 방법을 제공하는 클래스들의 집합을 의미한다
        * 즉, 데이터는 효율적으로 저장하는 잘교구조와 데이터를 처리하는 알고리즘을 미리 구현해 놓은 클래스를 말한다
        * */

        /*ArrayList
        * 가장 많이 사용되는 컬렉션 클래스
        *
        * 배열은 크기를 변경하는 것이 불가능하고 요소의 추가/삭제/정렬 등이 복잡하다
        * 이러한 기능을 메소드로 구ㅕㅎㄴ해서 제공하고 있으며 단, 속도가 빨라지는 것은 아니다*/

        /*다형성을 이용해서 상위 레퍼런스로 ArrayList객체를 참조할 수 있다
        * List인터페이스 하위의 다양한 구현체들로 타입변경이 가능하므로
        * 보다 유연한코드를 작성할 수 있다*/

        ArrayList alist = new ArrayList();

        List list = new ArrayList();

        Collection clist = new ArrayList();

        //java.util.LinkedList list1 = new LinkedList<>(new ArrayList<>());

        alist.add("hello");
        System.out.println(alist);
        alist.add(10); // autoboxing (값 => 객체)
        System.out.println(alist);

        System.out.println(alist.size());

        /*arraylist의 크기는 size()메소드로 확인가능
        * 단 size()메소드는 배열의 크기가 아닌 요소의 갯수를 반환한다*/

        for(int i=0;i<alist.size();i++){
            System.out.println(i + " : "  + alist.get(i));
        }

        alist.add("apple");
        System.out.println("alist = " + alist);
        alist.add(2,"order");

        alist.remove(2);
        System.out.println(alist);

        alist.set(1, Boolean.valueOf(true));
        System.out.println(alist);

        /*String타입의 Element만 저장하는 Arraylist 생성*/
        List<String> sl = new ArrayList<>();
        sl.add("apple");
        sl.add("orange");
        sl.add("banana");
        sl.add("grape");

        System.out.println("sl = " + sl);

        List<Integer> il = new ArrayList<>();
        il.add(1);
        il.add(5);
        il.add(2);
        il.add(6);
        System.out.println("il = " + il);
        il.sort(Integer::compareTo);
        System.out.println(il);


        /*
         * Iterator란?
         * Collection 인터페이스의 iterator() 메소드를 이용해서 인스턴스를 생성할 수 있다.
         * 컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용한다.
         * 반복자라고 불리우며, 반복문을 이용해서 목록을 하나씩 꺼내는 방식으로 사용하기 위함이다.
         *
         * 인덱스로 관리되는 컬렉션이 아닌 경우에는 반복문을 사용해서 요소에 하나씩 접근할 수 없기 때문에
         * 인덱스를 사용하지 않고도 반복문을 사용하기 위한 목록을 만들어주는 역할이라고 보면된다.
         *
         * hasNext() : 다음 요소를 가지고 있는 경우 true, 더이상 요소가 없는 경우 false를 반환
         * next() : 다음 요소를 반환
         * */

        sl = new LinkedList<>(sl);

        Iterator<String> dit = ((LinkedList<String>) sl).descendingIterator();
//        //dit.next();
//        while (dit.hasNext()) {
//            System.out.println(dit.next());
//        }

        List<String> descList = new ArrayList<>();
        while(dit.hasNext()) {
            descList.add(dit.next());
        }
        System.out.println("descList = " + descList);
    }

}
