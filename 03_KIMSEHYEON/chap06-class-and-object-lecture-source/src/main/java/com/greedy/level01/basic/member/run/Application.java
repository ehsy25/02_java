package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.dto.*;

public class Application {
    public static void main(String[] args) {
        MemberDTO memberDTO = new MemberDTO();
        System.out.println("=== 전 ===");
        System.out.println("ID : " + memberDTO.getId());
        System.out.println("Name : " + memberDTO.getName());
        System.out.println("Age : " + memberDTO.getAge());
        System.out.println("Gender : " + memberDTO.getGender());
        System.out.println("Phone : " + memberDTO.getPhone());
        System.out.println("Email : " + memberDTO.getEmail());


        memberDTO.setAge(20);
        memberDTO.setEmail("abd@example.com");
        memberDTO.setGender('M');
        memberDTO.setPhone("123456789");
        memberDTO.setId("user1");
        memberDTO.setPwd("123456");
        System.out.println("=== 후 ===");
        System.out.println("변경 후 ID : " + memberDTO.getId());
        System.out.println("변경 후 Name : " + memberDTO.getName());
        System.out.println("변경 후 Age : " + memberDTO.getAge());
        System.out.println("변경 후 Gender : " + memberDTO.getGender());
        System.out.println("변경 후 Phone : " + memberDTO.getPhone());
        System.out.println("변경 후 Email : " + memberDTO.getEmail());

    }
}
