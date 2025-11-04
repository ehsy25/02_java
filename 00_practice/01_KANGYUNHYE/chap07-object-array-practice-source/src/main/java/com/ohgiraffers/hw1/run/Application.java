package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        EmployeeDTO employeeDTO = new EmployeeDTO();

        EmployeeDTO[] employeeDTO1 = new EmployeeDTO[3];

        employeeDTO1[0] = new EmployeeDTO();
        employeeDTO1[1] = new EmployeeDTO(1,"홍길동",19,'M',"010-6666-8888", "용인 기흥");
        employeeDTO1[2] = new EmployeeDTO(2,"김초딩", "초등부", "초딩",9,'F',1000000,0.01,"010-7777-8888","서울마곡");

        for(EmployeeDTO emp : employeeDTO1) {
            System.out.println(emp.information());
        }
        System.out.println("============================================");

        employeeDTO1[0].setEmpNo(0);
        employeeDTO1[0].setEmpName("김말똥");
        employeeDTO1[0].setDept("영업부");
        employeeDTO1[0].setJob("팀장");
        employeeDTO1[0].setAge(30);
        employeeDTO1[0].setGender('M');
        employeeDTO1[0].setSalary(3000000);
        employeeDTO1[0].setBonusPoint(0.2);
        employeeDTO1[0].setPhone("01055559999");
        employeeDTO1[0].setAddress("전라도 광주");

        employeeDTO1[1].setDept("기획부");
        employeeDTO1[1].setJob("부장");
        employeeDTO1[1].setSalary(4000000);
        employeeDTO1[1].setBonusPoint(0.3);

        for(EmployeeDTO emp : employeeDTO1) {
            if(emp.getEmpNo()<2){
                System.out.println(emp.information());

            }
        }

        System.out.println("============================================");

        int sum = 0;
        for(int i=0;i<employeeDTO1.length;i++) {
            int m = (int)((employeeDTO1[i].getSalary()
                    +(employeeDTO1[i].getSalary()* employeeDTO1[i].getBonusPoint()))
                    *12);
            System.out.println(employeeDTO1[i].getEmpName()+"의 연봉 : "+m+"원");

            sum += m;

        }
        System.out.println("=============================================");

        System.out.println("직원들의 연봉의 평균 : "+ sum/3 +"원");

    }
}
