package com.ohgiraffers.Section04.constructor;

import java.util.Date;

public class User {

    /* 필드 선언문 */
    private String id;
    private String pwd;
    private String name;
    private Date enrollDate;

    /*  생성자 선언부
    * 접근제한자 클래스명([매개변수]){}
    * */
    /* 기본생성자 : 클래스 내부에 작성된 생성자가 0개인 경우 컴파일러가 자동으로 기본생성자를
    * 생성한다.
    * */
    public User() {
        System.out.println("User 기본 생성자 동작함");

        /* 매개변수 생성자:
        * 초기화될 필드가 여러 개일 경우 초기화하고 싶은 필드의 조합별로
        * 생성자를 여러개 작성할 수 있다.
        * */

        public User(String id, String pwd){
            this.id = id;
            this.pwd = pwd;
            System.out.println("User id, pwd 초기화 생성자 동작함");
        }
        public String getInformation(){
            return id + " " + " " + name + " " + enrollDate;
        }

    }

    public User(String id, String pwd, String name, Date enrollDate) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrollDate = enrollDate;
        System.out.println("user 모든 필드 초기화 생성자 동작함");
    }

    */
    /* 생성자 함수가 무엇인지 이해하고 선언 및 호출할 수 있다. */

    /*
    * 생성자 사용 목적
    * 1. 인스턴스 생성 시점에 수행할 명령이 있을 경우
    * 2. 매개변수 있는 생성자의 경우 매개변수로 전달받을 값으로 필드 초기화할 경우
    * 3. 작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지 않고 싶을 경우
    * => 인스턴스 생성 방법 제한, 초기값 전달 강제화
    * */
    User user1 = new User();
    System.out.println(user1.getInformation());
    User user2 = new User(id: "user01")
    System.out.println(user2.getInformation());

}
