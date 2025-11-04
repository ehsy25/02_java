package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application {
    public static void main(String[] args) {
        EmployeeDTO []emp = new EmployeeDTO[3];
        emp[0] = new EmployeeDTO();
        emp[1] = new EmployeeDTO(1,"홍길동",19,'M',"01022223333","서울 잠실");
        emp[2] = new EmployeeDTO(2,"강말순","교육부","강사",20,'F',1000000,0.01,"01011112222", "서울 마곡");
        for(int i=0;i<emp.length;i++){
            System.out.println("emp["+i+"]="+emp[i].information());
        }
        System.out.println("=============================================================");
        emp[0] = new EmployeeDTO(0,"김말똥","영업부","팀장",30,'M',3000000,0.2,"010555599999","전라도 광주");
        emp[1] = new EmployeeDTO(1,"홍길동","기획부","부장",19,'M',4000000,0.3,"01022223333","서울 잠실");
        for(int i=0;i<2;i++){
            System.out.println("emp["+i+"]="+emp[i].information());
        }
        System.out.println("=============================================================");
        for(int i=0;i<emp.length;i++){
            System.out.println(emp[i].getEmpName()+"의 연봉 : "+ (long)( emp[i].getSalary()+( emp[i].getSalary()*emp[i].getBonusPoint() ) )*12 + "원" );
        };
        System.out.println("=============================================================");
        long year=0;
        for(int i=0;i<emp.length;i++){
            year=(long)(( emp[i].getSalary()+( emp[i].getSalary()*emp[i].getBonusPoint() ) )*12)+(long)year;
        }
        System.out.println("직원들의 연봉의 평균 : " +year/3 + "원");

    }
}
