package com.sekong.hw1.model.dto;

public class Application {
    public static void main(String[] args) {
        EmployeeDTO[] emp = new EmployeeDTO[3];
        emp[0] = new EmployeeDTO();
        System.out.println("emp[0] : " + emp[0].information());
        emp[1] = new EmployeeDTO(1,"홍길동",19,'M',"01022223333","서울 잠실");
        System.out.println("emp[1] : " + emp[1].information());
        emp[2] = new EmployeeDTO(2,"강말순","교육부","강사",20,'F',1000000,0.01,"01011112222","서울 마곡");
        System.out.println("emp[2] : " + emp[2].information());
        System.out.println("================================");
        emp[0] = new EmployeeDTO(0,"김말똥","영업부","팀장",30,'M',3000000,0.2,"01055559999","전라도 광주");
        System.out.println("emp[0] : " + emp[0].information());
        emp[1] = new EmployeeDTO(1,"홍길동","기획부","부장",19,'M',4000000,0.3,"01022223333","서울 잠실");
        System.out.println("emp[1] : " + emp[1].information());
        System.out.println("================================");
        long emp1Salary = (long)(emp[0].getSalary()*(emp[0].getBonusPoint()+1))*12;
        long emp2Salary = (long)(emp[1].getSalary()*(emp[1].getBonusPoint()+1))*12;
        long emp3Salary = (long)(emp[2].getSalary()*(emp[2].getBonusPoint()+1))*12;
        System.out.println(emp[0].getEmpName()+"의 연봉 : " + emp1Salary);
        System.out.println(emp[1].getEmpName()+"의 연봉 : " + emp2Salary);
        System.out.println(emp[2].getEmpName()+"의 연봉 : "+ emp3Salary);
        System.out.println("=================================");
        System.out.println("직원들의 연봉의 평균 : " + (emp1Salary+emp2Salary+emp3Salary)/3);

    }
}
