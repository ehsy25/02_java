package com.E.section02.uses.subsection02.intermediate;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application3 {
    public static void main(String[] args) {
        /*스트림의 중계 연산 중 하나인 flatMap에 대해 이해하고 사용할 수 있다
        * Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper);
        * flatMap:중첩 구조를 한 단계 제거하고 다일 컬렉션으로 만들어준다
        * 이러한 작업을 flattening이라고 한다*/

        List<List<String>> list = Arrays.asList(Arrays.asList("java", "spring", "springboot"),Arrays.asList("J","S","SB"));

        System.out.println(list);

        List<String> flatList = list.stream().
                flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(flatList);

        List<String> sentence = Arrays.asList("hi", "j s a", "flatmap example");
        System.out.println(sentence);

        List<String> words = sentence.stream().flatMap(str -> Arrays.stream(str.split(" "))).toList();
        System.out.println(words);

        words.add("단어 추가"); // immutable이라 단어추가가 되지 않음
        System.out.println(words);

        /*unmopdifiable List (수정 불가 읽기 전용 리스트 -불변성 보장)*/


        // 다 수정이 불가능함 단어추가 안됨
        List<String> unmodifiableList = Collections.unmodifiableList(flatList);
        System.out.println(unmodifiableList);
        List<String> unmodifiableList2 = List.of("A","B","C");
        List<String> unmodifiableList3 = Stream.of("A","B","C").toList();


    }
}
