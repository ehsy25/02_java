package com.ohgiraffers.section03.dto;

public class Application {

    /* 데이터를 추상화하는 기법을 이해하고 사용
    *
    * DTO(Data Transfer Object) : 계층 간의 데이터 전달 용도로 사용되는 클래스
    * 캡슐화의 원칙에 따라 작성하기는 했으나 캡슐화가 의미 없을 정도로
    * 필드명을 그대로 사용한 setter, getter메소드로 인해 유지보수성이 좋지는 않음 */

    public static void main(String[] args) {
        MemberDto memberDto = new MemberDto();
        memberDto.setNumber(1);
        memberDto.setName("홍길동");
        memberDto.setAge(20);
        memberDto.setGender('남');
        memberDto.setHeight(185.3);
        memberDto.setWeight(85.3);
        memberDto.setActivated(true);

        System.out.println(memberDto.getNumber());
        System.out.println(memberDto.getName());
        System.out.println(memberDto.getAge());
        System.out.println(memberDto.getGender());
        System.out.println(memberDto.getHeight());
        System.out.println(memberDto.getWeight());
        System.out.println(memberDto.isActivated());

        testMethod(memberDto);
        getMemberDTO(memberDto);
    }

    public static void testMethod(MemberDto memberDto) {
        System.out.println(memberDto.getName());
    }

    public static MemberDto getMemberDTO(MemberDto memberDto) {
        memberDto.setNumber(2);
        return memberDto;
    }
}
