package com.ohgiraffers.section04.constructor;

import java.util.Date;

public class User {

    /* 필드 선언문 */
     private String id;
     private String pwd;
     private String name;
     private Date enrollDate;

    /* 생성자 선언부
    *접근제한자 클래스명([매개변수]){}
    * */
    /* 기본생성자: 클래스 내부에 작성된 생성자가 0개인 경우 컴파일러가 자동으로 기본생성자를
    *생성한다.
    **/
     public User() {
         System.out.println(" User 기본 생성자 동작함");
     }
}
