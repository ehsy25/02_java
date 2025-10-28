package com.chaewookim.hw1.run;

import com.chaewookim.hw1.model.dto.EmployeeDTO;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        EmployeeDTO[] earr = new EmployeeDTO[3];

        earr[0] = new EmployeeDTO();
        earr[1] = new EmployeeDTO(1, "홍길동", 'M', 19, "01022223333", "서울 잠실");
        earr[2] = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");

        for (EmployeeDTO i : earr) {
            System.out.println(i.getInformation());
        }
        System.out.println("==========================");

        earr[0].setEmpNo(0);
        earr[0].setEmpName("김말똥");
        earr[0].setDept("영업부");
        earr[0].setJob("팀장");
        earr[0].setAge(30);
        earr[0].setGender('M');
        earr[0].setSalary(3000000);
        earr[0].setBonusPoint(0.2);
        earr[0].setPhone("01055559999");
        earr[0].setAddress("전라도 광주");

        earr[1].setJob("부장");
        earr[1].setDept("기획부");
        earr[1].setSalary(4000000);
        earr[1].setBonusPoint(0.3);

        System.out.println(earr[0].getInformation());
        System.out.println(earr[1].getInformation());
        System.out.println("======================");

        int sum = 0;
        for (EmployeeDTO i : earr) {
            System.out.println(i.getEmpName() + "의 연봉: " + (i.getBonusPoint()*12*i.getSalary() + i.getSalary()) + "원");
            sum += (i.getBonusPoint()*12*i.getSalary() + i.getSalary());
        }
        System.out.println("직원들의 연봉의 평균: " + sum);
    }
}
