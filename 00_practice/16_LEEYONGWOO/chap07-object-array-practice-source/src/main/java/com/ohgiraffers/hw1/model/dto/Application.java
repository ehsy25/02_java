package com.ohgiraffers.hw1.model.dto;

public class Application {
    public static void main(String[] args) {
        EmployeeDTO[] emp={new EmployeeDTO(),
        new EmployeeDTO(1,"홍길동",19,'M',"01022223333","서울잠실"),
        new EmployeeDTO(2,"강말순","교육부","강사",20,'F',1000000,0.01,"01011112222","서울 마곡")};

        for(int i=0; i<emp.length; i++){
            System.out.println("emp["+i+"] : "+emp[i].information());
        }

        System.out.println("==============================================================");

        emp[0]=new EmployeeDTO(0,"김말똥","영업부","팀장",30,'M',3000000,0.2,"01055555999999","전라도 광주");
        emp[1]=new EmployeeDTO(1,"홍길동","기획부","부장",19,'M', 4000000,0.3,"010222223333","서울 잠실");

        for(int i=0; i<2; i++){
            System.out.println("emp["+i+"] : "+emp[i].information());
        }
        double avgSalary=0;
        for(int i=0; i<emp.length; i++){
            double tmp=(emp[i].getSalary()+(emp[i].getSalary()*emp[i].getBonusPoint()))*12;
            avgSalary+=tmp;
            System.out.println(emp[i].getEmpName()+"의 연봉 : "+(int)tmp);
        }

        System.out.println("==============================================================");

        //연봉 평균 구하기
        avgSalary/=3;


        System.out.printf("직원들의 연봉의 평균 : "+(int)avgSalary+"원");

    }
}
