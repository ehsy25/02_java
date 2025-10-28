package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application {
    public static void main(String[] args) {

        EmployeeDTO[] emp = new EmployeeDTO[3];
        emp[0] = new EmployeeDTO();
        System.out.println(emp[0].toString());
        emp[1] =new EmployeeDTO(1, "홍길동", null, null, 19, 'M', 0, 0.0, "01022223333", "서울 잠실");
        System.out.println(emp[1].toString());
        emp[2] = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
        System.out.println(emp[2].toString());

        System.out.println("==================================================================");
        emp[0] = new EmployeeDTO(0, "김말똥", "영업부", "팀장", 30, 'M', 3000000, 0.2, "01055559999", "전라도 광주");
        System.out.println(emp[0].toString());
        emp[1] = new EmployeeDTO(1, "홍길동", "기획부", "부장", 19, 'M', 4000000, 0.3, "01022223333", "서울 잠실");
        System.out.println(emp[1].toString());
        System.out.println("==================================================================");
        emp[0].total_salary();
        emp[1].total_salary();
        emp[2].total_salary();
        System.out.println("==================================================================");
        System.out.println("직원들의 연봉의 평균 : "+(emp[0].getSalary() + emp[1].getSalary() + emp[2].getSalary())/3 + "원");

    }
}
