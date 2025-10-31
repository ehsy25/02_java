package com.ohgiraffers.hw1.run.Application;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application1 {
    public static void main(String[] args) {
        EmployeeDTO[] arr = new EmployeeDTO[3];

        EmployeeDTO dto1 = new EmployeeDTO();
        EmployeeDTO dto2 = new EmployeeDTO(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
        EmployeeDTO dto3 = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");

        arr[0] = dto1;
        arr[1] = dto2;
        arr[2] = dto3;

        for (EmployeeDTO employeeDTO : arr) {
            System.out.println(employeeDTO.information());
        }
        System.out.println("======================");


        dto1.setEmpName("김말똥");
        dto1.setDept("영업부");
        dto1.setJob("팀장");
        dto1.setAge(30);
        dto1.setGender('M');
        dto1.setSalary(3000000);
        dto1.setBonusPoint(0.2);
        dto1.setPhone("01055559999");
        dto1.setAddress("전라도 광주");

        dto2.setDept("기획부");
        dto2.setJob("부장");
        dto2.setSalary(4000000);
        dto2.setBonusPoint(0.3);

        System.out.println("======================");
        System.out.println(dto1.information());
        System.out.println(dto2.information());
        System.out.println("======================");


        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int salaryYear = (int)((arr[i].getSalary() + (arr[i].getSalary() * arr[i].getBonusPoint())) * 12);
            System.out.println(arr[i].getEmpName() + "의 연봉 : " + salaryYear + '원');
            sum += salaryYear;
        }
        System.out.println("======================");
        System.out.println("직원들의 연봉의 평균 : " + (int)((double)sum/arr.length) + '원');
    }


}
