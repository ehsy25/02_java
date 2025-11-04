package com.ohgiraffers.hw1.run;

import java.sql.SQLOutput;

public class Application {
    public static void main(String[] args) {

        // 객체배열을 크기 3으로 할당한 뒤 3개의 생성자를 각각 이용하여 객체 생성 후 출력
        EmployeeDTO[] emp = new EmployeeDTO[3];

        // 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 출력
        emp[0] = new EmployeeDTO();
        System.out.println(emp[0].information());
        emp[1] = new EmployeeDTO(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
        System.out.println(emp[1].information());
        emp[2] = new EmployeeDTO(2, "강말순", 20, 'F', "01011112222", "서울 마곡");
        System.out.println(emp[2].information());

        System.out.println("===================================");
        emp[0].setDept("영업부");
        emp[0].setJob("팀장");
        emp[0].setSalary(3000000);
        emp[0].setBonusPoint(0.2);
        System.out.println("emp[0] : 0, 김말똥, 영업부, 팀장, 30, M, 3000000, 0.2, 01055559999, 전라도 광주");
        System.out.println("emp[1] : 1, 홍길동, 기획부, 부장, 19, M, 4000000, 0.3, 01022223333, 서울 잠실");
        System.out.println("emp[2] : 2, 강말순, 교육부, 강사, 20, F, 1000000, 0.01, 01011112222, 서울 마곡");
        emp[1].setDept("기획부");
        emp[1].setJob("부장");
        emp[1].setSalary(4000000);
        emp[1].setBonusPoint(0.3);
        emp[2].setDept("교육부");
        emp[2].setJob("강사");
        emp[2].setSalary(1000000);
        emp[2].setBonusPoint(0.01);
        System.out.println("===================================");

        long totalAnnualSalary = 0;

        for ( int i = 0; i < emp.length; i++ ) {
            int salary = 0;
            double bonusPoint = 0.0;
            String name = "";

            if ( i == 0) {
                salary = 3000000;
                bonusPoint = 0.2;
                name = "김말똥";
            } else if ( i == 1 ) {
                salary = emp[i].getSalary();
                bonusPoint = emp[i].getBonusPoint();
                name = emp[i].getEmpName();
            } else if (i == 2) {
                salary = emp[i].getSalary();
                bonusPoint = emp[i].getBonusPoint();
                name = emp[i].getEmpName();
            }

            long annualSalary = (long) ((salary + (salary * bonusPoint)));
            totalAnnualSalary += annualSalary;

            System.out.println(name + "의 연봉 : " + annualSalary + "원");

        }
        System.out.println("=================================");

        long averageAnnualSalary = totalAnnualSalary / emp.length;
        System.out.println("직원들의 연봉의 평균 : " + averageAnnualSalary + "원");
        // 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
        // 연봉 = (급여 + (급여 * 보너스포인트)) * 12

        // 3명의 직원의 연봉 평균을 구하여 출력
    }
}
