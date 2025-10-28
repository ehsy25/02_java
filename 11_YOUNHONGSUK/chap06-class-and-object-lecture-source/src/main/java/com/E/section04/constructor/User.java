package com.E.section04.constructor;

import java.util.Date;

public class User {

    private String id;
    private String pwd;
    private String name;
    private Date enrollDate;

    /*
    * 생성자 선언부
    * 접근제한자 클래스명 (매개변수)
    * 반환값이 없다는 특징이 있다
    * 기본생성자 : 클래스 내부에 작성된 생성자가 0개인 경우 컴파일러가 자동으로 기본생성자를 생성한다*/

    public User(){

        System.out.println("it works");

    }

    public User(String id, String pwd){
        this.id = id;
        this.pwd = pwd;
    }

    public String getInfo(){
        return id + " " + pwd + " " + name + " " + enrollDate;
    }

    public User(String id, String pwd, String name, Date enrollDate) {
     /*동일 클래스 내의 다른 생성자 메소드를 호출하는 구문
     * 리턴 되어 돌아오지만 리턴값은 존재하지 않으념 가장 첫줄에 선언해야한다*/
        this(id,pwd);

        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrollDate = enrollDate;
    }
}
