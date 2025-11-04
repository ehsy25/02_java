package com.ohgiraffers.section04.uses2;

public class Person {

    /* 생성자로 한 번 들어오면 불변 --> final 붙어도 됨 */
    private final SaveProvider saveProvider;

    /* Person 객체는 무조건 SaveProvider를 사용해서 생성해야 한다. (기본 생성자로 객체는 만들어지지 않는다) */
    public Person(SaveProvider saveProvider) {
        this.saveProvider = saveProvider;
    }

    public void doSomething() {
        String data = "String data";

        saveProvider.save(data); // FileSaveProvider에 있는 save로 동적 바인딩이 일어날 예정
    }
}
