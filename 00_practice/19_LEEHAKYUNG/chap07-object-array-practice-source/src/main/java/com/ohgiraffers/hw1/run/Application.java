package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        EmployeeDTO[] empDTO = new EmployeeDTO[3];
        empDTO[0] = new EmployeeDTO();
        empDTO[1] = new EmployeeDTO(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
        empDTO[2] = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
        System.out.println("emp[0] : " + empDTO[0].information());
        System.out.println("emp[1] : " + empDTO[1].information());
        System.out.println("emp[2] : " + empDTO[2].information());
        System.out.println("==============================================");

        empDTO[0] = new EmployeeDTO(0, "김말똥", "영업부", "팀장", 30, 'M', 3000000, 0.2, "01055559999", "전라도 광주");
        empDTO[1].setDept("기획부");
        empDTO[1].setJob("부장");
        empDTO[1].setSalary(4000000);
        empDTO[1].setBonusPoint(0.3);
        System.out.println("emp[0] : " + empDTO[0].information());
        System.out.println("emp[1] : " + empDTO[1].information());
        System.out.println("==============================================");

        int[] empAnnualSalary = new int[3];
        empAnnualSalary[0] = (int) (empDTO[0].getSalary() + (empDTO[0].getSalary() * empDTO[0].getBonusPoint())) * 12;
        empAnnualSalary[1] = (int) (empDTO[1].getSalary() + (empDTO[1].getSalary() * empDTO[1].getBonusPoint())) * 12;
        empAnnualSalary[2] = (int) (empDTO[2].getSalary() + (empDTO[2].getSalary() * empDTO[2].getBonusPoint())) * 12;
        System.out.println(empDTO[0].getEmpName() + "의 연봉 : " + empAnnualSalary[0] + "원");
        System.out.println(empDTO[1].getEmpName() + "의 연봉 : " + empAnnualSalary[1] + "원");
        System.out.println(empDTO[2].getEmpName() + "의 연봉 : " + empAnnualSalary[2] + "원");

        System.out.println("==============================================");
        int avgAnnualSalary = (int) ((empAnnualSalary[0] + empAnnualSalary[1] + empAnnualSalary[2]) / 3);
        System.out.println("직원들의 연봉의 평균 : " + avgAnnualSalary + "원");
    }
}
