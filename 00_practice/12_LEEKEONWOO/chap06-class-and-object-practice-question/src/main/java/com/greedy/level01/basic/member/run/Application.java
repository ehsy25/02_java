package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.dto.MemberDTO;

public class Application {

    public static void main(String[] args) {
        MemberDTO mb = new MemberDTO();
        System.out.println("id : " + mb.getId());
        System.out.println("pwd : " + mb.getPwd());
        System.out.println("name : " + mb.getName());
        System.out.println("age : " + mb.getAge());
        System.out.println("gender : " + mb.getGender());
        System.out.println("phone : " + mb.getPhone());
        System.out.println("email : " + mb.getEmail());

        mb.setId("user01");
        mb.setPwd("pass01");
        mb.setName("홍길동");
        mb.setAge(20);
        mb.setGender('M');
        mb.setPhone("010-1234-5678");
        mb.setEmail("hong123@greedy.com");

        System.out.println("변경 후 id : " + mb.getId());
        System.out.println("변경 후 pwd : " + mb.getPwd());
        System.out.println("변경 후 name : " + mb.getName());
        System.out.println("변경 후 age : " + mb.getAge());
        System.out.println("변경 후 gender : " + mb.getGender());
        System.out.println("변경 후 phone : " + mb.getPhone());
        System.out.println("변경 후 email : " + mb.getEmail());

    }
}
