package com.E.section02.uses.subsection01.generation;

import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Application2 {
    public static void main(String[] args) {
        /*기본 자료형 스트림 생성에 대해 이해하고 사용할 수 있다*/
        IntStream it = IntStream.range(5, 10);
        it.forEach(i -> System.out.print(i + " "));
        System.out.println();

        LongStream ls = LongStream.rangeClosed(5,10);
        ls.forEach(i -> System.out.print(i + " "));

        /*Wrapper 클래스 자료형의 스트림으로 변환이 필요한 경우 boxing할 수 있다*/
        Stream<Double> dS = new Random().doubles(5).boxed();
        dS.forEach(i -> System.out.print(i + " "));
        System.out.println();

        /*문자열을 IntStream으로 변환할 수 있다*/
        IntStream helloWorldChars = "hello world".chars();
        helloWorldChars.forEach(i -> System.out.print(i + " "));
        System.out.println();

        /*문자열을 split해서*/
        Stream<String> splitStream = Pattern.compile(", ").splitAsStream("html, css, javascript");
        splitStream.forEach(i -> System.out.print(i + "! "));

        /*Stream of() */
        Stream<String> ss1 = Stream.of("hello","world");
        Stream<String> ss2 = Stream.of("java","world");
        //ss1.forEach(i -> System.out.print(i + "nono "));
        System.out.println();
        //ss2.forEach(i -> System.out.print(i + " "));

/*스트림은 1ㅚ용으로만 사용할 수 있다. 최종 연산(ex forEach)등이 수행된 스트림은 재상용할 수 없다.
* 재사용하면 java.,lang.IllegalStateException이 발생한다*/
        System.out.println();
        /*concat을 동해 스트림 합치기*/
    Stream<String> concatSTream = Stream.concat(ss1, ss2);
    concatSTream.forEach(i -> System.out.print(i + " "));
    }
}
