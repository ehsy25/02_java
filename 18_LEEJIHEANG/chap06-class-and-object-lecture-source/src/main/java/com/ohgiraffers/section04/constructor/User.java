package com.ohgiraffers.section04.constructor;

import java.util.Date;

public class User {

    /*필드 선언문*/
    private String id;
    private String pwd;
    private String name;
    private Date enrollDate;

    /* 생성자 선언부
    * 접근제한자 클래스명([매개변수])()
    * 반환값이 없으면 생성자 반환값이 있으면 일반 메소드
    * */
    /*기본생성자 : 클래스 내부에 작성된 생성자가 6개인 경우 컴파일러가 자동으로 기본생성자를 생성한다.*/

    public User() {
        System.out.println("User 기본 생성자 동작함");
    }


    /*매개변수 생성자:
    * 초기화될 필드가 여러 개일 경우 초기화하고 싶은 필드의 조합별로 생성자를 여러 개 작성할 수 있다.
    * */
    public User(String id, String pwd){
        this.id = id;
        this.pwd = pwd;
        System.out.println("User id, pwd 초기화 생성자 동작함");
    }

    public User(String id, String pwd, String name, Date enrollDate) {
//        this.id = id;
//        this.pwd = pwd;
        /*동일 클래스 내의 다른 생성자 메소드를 호출하는 구문*/
        /*리턴되어 돌아오지만 리턴값은 존재하지 않으며 가장 첫줄에 선언해야 한다.*/
        this(id, pwd);
        this.name = name;
        this.enrollDate = enrollDate;
        System.out.println("user 모든 필드 초기화 생성자 동작함");
    }

    public String getInformation() {
    return id + " " + pwd + " " + name + " " + enrollDate;
    }
}
// 오버로딩은 같은 이름의 클래스, 메소드를 다른 변수로 계속 사용하는것이다.
// 생성자도 일종의 메소드 중에 하나로 보고 있기 때문에 해당 내용의 생성자도 오버 로딩이 가능하다.
//
