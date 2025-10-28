package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application {
    public static void main(String[] args) {


            EmployeeDTO[] emps = new EmployeeDTO[3];
            emps[0] = new EmployeeDTO();
            emps[1] = new EmployeeDTO(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
            emps[2] = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");

            for (EmployeeDTO emp : emps) {
                System.out.println(emp.information());
            }

            System.out.println("===================================================");

            emps[0] = new EmployeeDTO(0, "김말똥", "영업부", "팀장", 30, 'M', 3000000, 0.2, "01055559999", "전라도 광주");
            emps[1] = new EmployeeDTO(1, "홍길동", "기획부", "부장", 19, 'M', 4000000, 0.3, "01022223333", "서울 잠실");

            for (EmployeeDTO emp : emps) {
                System.out.println("emp["+ emp.getEmpNo() + "] : " +emp.information());
            }

            System.out.println("===================================================");

            for (EmployeeDTO emp : emps) {
                System.out.println("emp["+ emp.getEmpNo() + "] : " +emp.information());
            }

            System.out.println("===================================================");

            int total = 0;
            for (EmployeeDTO emp : emps) {
                double money = (emp.getSalary() + (emp.getSalary() * emp.getBonusPoint())) * 12;
                System.out.println(emp.getEmpName() + "의 연봉 : " + (int)money + "원");
                total += (int)money;
            }

            System.out.println("===================================================");

            System.out.println("직원들의 연봉의 평균 : " + total / 3 + "원");

    }
}
