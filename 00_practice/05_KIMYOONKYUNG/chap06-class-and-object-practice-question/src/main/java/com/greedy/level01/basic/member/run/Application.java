package com.greedy.level01.basic.member.run;
import com.greedy.level01.basic.member.model.dto.MemberDTO;

public class Application {
    public static void main(String[] args) {
        MemberDTO member = new MemberDTO();


            System.out.println("member.id = " + member.getId());
            System.out.println("member.pwd = " + member.getPwd());
            System.out.println(("member.name = " + member.getName()));
            System.out.println("member.age = " + member.getAge());
            System.out.println("member.gender = " + member.getGender());
            System.out.println("member.phone = " + member.getPhone());
            System.out.println("member.email = " + member.getEmail());

            member.setId( "user01");;
            member.setPwd("pass01");
            member.setName("홍길동");
            member.setAge(20);
            member.setGender('M');
            member.setPhone("010-1234-5678");
            member.setEmail("hong123@greedy.com");

        System.out.println("member.id = " + member.getId());
        System.out.println("member.pwd = " + member.getPwd());
        System.out.println(("member.name = " + member.getName()));
        System.out.println("member.age = " + member.getAge());
        System.out.println("member.gender = " + member.getGender());
        System.out.println("member.phone = " + member.getPhone());
        System.out.println("member.email = " + member.getEmail());


        }

    }
