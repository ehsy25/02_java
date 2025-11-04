package com.ohgiraffers.section03.dto;

public class application {

    /* 데이터를 추상화하는 기법을 이해하고 사용 */
    /*
    * DTO(Data Transfer Object): 계층 간의 데이터 전달 용도로 사용되는 클래스
    * 캡슐화의 원칙에 따라 작성하기는 했으나 캡슐화가 의미 없을 정도로
    * 필드명을 그대로 사용한 setter, getter 메소드로 인해 유지보수성이 좋지는 않다.
    * */
        public static void main(String[] args) {
            MemberDTO memberDTO = new MemberDTO();
            memberDTO.setNumber(1);
            memberDTO.setName("홍길동");
            memberDTO.setAge(20);
            memberDTO.setGender('남');
            memberDTO.setHeight(185..3);
            memberDTO.setWeight(85.3);
            memberDTO.setActivated(True);

            System.out.println(memberDTO.getName());

        }


        public static void main(String[] args) {...}

        public void testMethod1(MemberDto memberDto)
            system.out.println(memberDto,getName())

        public static MemberDTO getMemberDTO(memberDto, memberDto) {
            memberDto.setNumber(2);
            return  memberDto
        }

}
