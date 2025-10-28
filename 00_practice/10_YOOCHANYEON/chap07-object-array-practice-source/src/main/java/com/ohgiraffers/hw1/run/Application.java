package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

import java.sql.SQLOutput;

public class Application {

    public static void main(String[] args) {

        EmployeeDTO[] emp = new EmployeeDTO[3];

        emp[0] = new EmployeeDTO();
        emp[1] = new EmployeeDTO(1, "고길동", 29
                , '남', "01011111111", "서울 길동");
        emp[2] = new EmployeeDTO(2, "강말숙"
                , "교육부", "강사", 31, 'F'
                , 1500000, 0.05, "01022222222"
                , "서울 마곡");

        for(int i = 0; i < emp.length; i++){
            System.out.println("emp[" + i + "] : " +
                    emp[i].information());
        }

        emp[0].setEmpNo(0);
        emp[0].setEmpName("김소똥");
        emp[0].setDept("영업부");
        emp[0].setJob("인턴");
        emp[0].setAge(81);
        emp[0].setGender('M');
        emp[0].setSalary(140000);
        emp[0].setBonusPoint(0.003);
        emp[0].setPhone("01000000000");
        emp[0].setAddress("강원도 횡성");

        emp[1].setDept("광선검부");
        emp[1].setJob("대표");
        emp[1].setSalary(140000000);
        emp[1].setBonusPoint(0.3);

        System.out.println("========================================================================");
        for(int i = 0; i < emp.length; i++){
            System.out.println("emp[" + i + "] : " +
                    emp[i].information());
        }

        System.out.println("========================================================================");
        int total = 0;
        for(int i = 0;i < emp.length; i++){
            System.out.println(emp[i].getEmpName() + "의 연봉 : " +
                    (int)((emp[i].getSalary()*12) +
                    (emp[i].getSalary()*12)*emp[i].getBonusPoint()) + "원");
            total += emp[i].getSalary();
        }
        System.out.println("========================================================================");
        System.out.println("직원들의 평균 연봉 : " + total + "원");



    }
}
