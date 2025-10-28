package com.lhw.section04.uses2;

public class Person {

    /*왜 SaveProvider를 가져오는가?
    * -> File과 Database 둘 다 접근하기 위해서 인터페이스를 가져온다.
    * 상위타입으로 가져온 상태이다.*/
    private SaveProvider saveProvider; // 현재 상태는 Null값이 들어온 상태

    /*강제적으로 SaveProvide를 가져오기 위한 방법
    * 기본 생성자로 객체가 만들어지지 않는 상태 (매개변수가 반드시 필요한 상태)
    * 필드에 있는 내용을 초기화 시켜준 상태이다. */
    public Person(SaveProvider saveProvider) {
        this.saveProvider = saveProvider;
    }
    /*기본생성자가 아닌 반드시 매개변수가 필요한 상태이다.*/

    public void doSomething() {
        String data = "string data";

        saveProvider.save(data);
    }
}
