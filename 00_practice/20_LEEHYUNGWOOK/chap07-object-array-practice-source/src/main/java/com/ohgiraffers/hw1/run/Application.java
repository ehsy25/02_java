package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application {

    public static void main(String[] args) {

        EmployeeDTO[] dtos = new EmployeeDTO[3];

        dtos[0] = new EmployeeDTO();
//        System.out.println("dto[0] : " + dtos[0].information());
        dtos[1] = new EmployeeDTO(1,"홍길동",19,'M',"01022223333","서울 마곡");
//        System.out.println("dto[0] : " + dtos[1].information());
        dtos[2] = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");

        // 객체배열을 크기 3으로 할당 한 뒤 3개의 생성자를 각각 이용하여 객체 생성 후 출력
        for ( int i = 0; i < dtos.length; i++ ) {
            System.out.println("dto["+i+"] = "+ dtos[i].information());
        }
        System.out.println("=================================================================");

        // 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 출력
        dtos[0].setEmpNo(0);
        dtos[0].setEmpName("김말똥");
        dtos[0].setDept("영업부");
        dtos[0].setJob("팀장");
        dtos[0].setAge(30);
        dtos[0].setGender('M');
        dtos[0].setSalary(3000000);
        dtos[0].setBonusPoint(0.2);
        dtos[0].setPhone("01055559999");
        dtos[0].setAddress("전라도 광주");

        dtos[1].setDept("기획부");
        dtos[1].setJob("부장");
        dtos[1].setSalary(4000000);
        dtos[1].setBonusPoint(0.3);

        for ( int i = 0; i < 2; i++ ) {
            System.out.println("dto["+i+"] = "+ dtos[i].information());
        }
        System.out.println("=================================================================");
        // 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
        int salaryResult = 0;
        int salarySum = 0;
        for ( int i = 0; i < dtos.length; i++ ) {
            int salaryBefore = dtos[i].getSalary();
            double bonus_point = dtos[i].getBonusPoint();
            salaryResult = (salaryBefore + (int) (salaryBefore * bonus_point)) * 12;
            //평균용
            salarySum += salaryResult;
            System.out.println(dtos[i].getEmpName()+"의 연봉 : " + salaryResult + "원");
        }
        System.out.println("=================================================================");
        // 3명의 직원의 연봉 평균을 구하여 출력
        System.out.println("직원들의 연봉의 평균 : " + (int) (salarySum/3) + "원");
    }
}
