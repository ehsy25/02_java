package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application {
    public static void main(String[] args) {

        /*3개의 생성자를 사용하여 3명의 사원 정보
    를 배열로 생성한 후 출력 해보고 값이 없
    는 필드에 각각 값을 입력해 넣어 출력
    직원 각각의 보너스가 적용된 연봉을 계산
    하여 출력하고 총 직원 연봉의 평균을 구하여 출력*/


        //BookDTO bookDTO = new BookDTO();
        //bookDTO.printInformation();

        EmployeeDTO[] emp = new EmployeeDTO[3];
        //dto.printInformation();

        emp[0] = new EmployeeDTO();
        emp[1] = new EmployeeDTO(1, "홍길동", "총무부", "사원", 'M', 3000000, 0.1, "01022223333", "서울 잠실");
        emp[2] = new EmployeeDTO(2, "강말순", "교육부", "강사", 'F', 1000000, 0.01, "01011112222", "서울 마곡");

        for( int i = 0; i < emp.length; i++ ) {
            System.out.println("emp[" + i + "] : " + emp[i].information());
        }

        System.out.println("================================================================= ");

        emp[0].setEmpName("김말똥");
        emp[0].setDept("영업부");
        emp[0].setJob("팀장");
        emp[0].setDept("30");
        emp[0].setGender('M');
        emp[0].setSalary(3000000);
        emp[0].setBonusPoint(0.2);
        emp[0].setPhone("01055559999");
        emp[0].setAddress("전라도 광주");

        emp[0].setEmpName("홍길동");
        emp[0].setDept("가획부");
        emp[0].setJob("부장");
        emp[0].setDept("19");
        emp[0].setGender('M');
        emp[0].setSalary(4000000);
        emp[0].setBonusPoint(0.3);
        emp[0].setPhone("01022223333");
        emp[0].setAddress("서울 잠실");


        for (int i = 0; i < 2; i++) { // emp[0]과 emp[1]만 변경됨
            System.out.println("emp[" + i + "] : " + emp[i].information());
        }

        System.out.println("=================================================================");

        int totalSalary = 0;
        for (EmployeeDTO e : emp) {
            int annualSalary = (int) ((e.getSalary() + (e.getSalary() * e.getBonusPoint())) * 12);
            totalSalary += annualSalary;
            System.out.println(e.getEmpName() + "의 연봉 : " + annualSalary + "원");
        }

        System.out.println("=================================================================");


        int avgSalary = totalSalary / emp.length;
        System.out.println("직원들의 연봉의 평균 : " + avgSalary + "원");
    }
}






        // 객체배열을 크기 3으로 할당 한 뒤 3개의 생성자를 각각 이용하여 객체 생성 후 출력
        // 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 출력
        // 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
        // 연봉 = (급여 + (급여 * 보너스포인트)) * 12

        // 3명의 직원의 연봉 평균을 구하여 출력

