package com.ohgiraffers.hw1;

import com.ohgiraffers.hw1.model.EmployeeDTO;

public class Application {

    public static void main(String[] args) {

        EmployeeDTO[] employeeDTO = new EmployeeDTO[3];
        employeeDTO[0] = new EmployeeDTO();
        employeeDTO[1] = new EmployeeDTO(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
        employeeDTO[2] = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
        double[] salary = new double[3];


        int cnt = 0;
        int cnt1 = 0;
        int sumOfSalary = 0;

        for (EmployeeDTO dto1 : employeeDTO) {
            System.out.print("emp[" + cnt + "] : ");
            System.out.println(dto1.information());
            cnt++;
        }
        System.out.println("=======================================");

        employeeDTO[0] = new EmployeeDTO(0, "김말똥", "영업부", "팀장", 30, 'M', 3000000, 0.2, "01055559999", "전라도 광주");
        employeeDTO[1] = new EmployeeDTO(1, "홍길동", "기획부", "부장", 19, 'M', 4000000, 0.3, "01022223333", "서울 잠실");

        for(int j = 0; j < employeeDTO.length - 1; j++){
            System.out.print("emp[" + j + "] : ");
            System.out.println(employeeDTO[j].information());
        }
        System.out.println("=======================================");

        for(int i = 0; i < employeeDTO.length; i++) {
            System.out.print("emp[" + i + "] : ");
            salary[i] = ((employeeDTO[i].getSalary() + (employeeDTO[i].getSalary() * employeeDTO[i].getBonusPoint())) * 12);
            System.out.println((int) salary[i]);
        }

        for (int i = 0; i < salary.length; i++) {
            sumOfSalary += salary[i];
        }
        System.out.println("=======================================");
        System.out.println("직원들의 연봉의 평균 : " + sumOfSalary / 3);
    }

}
