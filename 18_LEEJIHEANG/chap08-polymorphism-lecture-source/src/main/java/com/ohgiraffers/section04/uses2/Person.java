package com.ohgiraffers.section04.uses2;

public class Person {

    private SaveProvider saveProvider; // 둘 다 접근할 수 있기 때문에 saveprovider를 사용함

    public Person(SaveProvider saveProvider) {
        this.saveProvider = saveProvider;
    }

    public void doSomething() {
        String data = "string data";

        saveProvider.save(data); // implements 한 다음 save에 넣어주면 바꿔치기 용이함 결합도가 낮아진다.
    }


}
