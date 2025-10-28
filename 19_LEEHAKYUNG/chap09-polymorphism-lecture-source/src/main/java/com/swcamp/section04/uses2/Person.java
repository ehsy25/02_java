package com.swcamp.section04.uses2;

public class Person {

    /*
    File/Database 타입을 구분하지 않고 "SaveProvider"를 구현하고 싶으니
    상위 클래스인 SaveProvider로
     */
    private SaveProvider saveProvider;

    public Person(SaveProvider saveProvider) {  // Person생성 시 SaveProvider를 입력해야 함.
        this.saveProvider = saveProvider;
    }

    public void doSomething() {
        String data = "string data";
        saveProvider.save(data);    // 동적 바인딩이 일어남.
    }
}
