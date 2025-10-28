package com.E.section03.dto;

public class Application {
    public static void main (String[] args) {
        /*DTO data transfer object
        * 계층 간의 데이터 전달 용도로 사용되는 클래스
        * 캡슐화의 원칙에 따라 작성하기는 했으나 캡슐화가 의미 없을 정도로
        * 필드명을 그대로 사용한 setter, getter메소드로 인해 유지보수성이 좋지는 않다*/

    MemberDto memberDto = new MemberDto();
    memberDto.setName("홍길동");
    memberDto.setAge(30);
    memberDto.setGender('M');
    memberDto.setHeight(185.3);
    memberDto.setWeight(85.3);
    memberDto.setActivated(true);

    memberDto.getNumber();
    memberDto.getAge();
    memberDto.getGender();
    memberDto.getHeight();
    memberDto.getWeight();
    memberDto.isActivated();


    }
}
