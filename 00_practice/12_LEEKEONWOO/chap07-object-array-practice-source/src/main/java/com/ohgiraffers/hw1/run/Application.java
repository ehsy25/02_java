package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application {

    public static void main(String[] args) {
        // 객체배열을 크기 3으로 할당 한 뒤 3개의 생성자를 각각 이용하여 객체 생성 후 출력
        EmployeeDTO emp1 = new EmployeeDTO();
        System.out.println("emp[0] : " + emp1.getInformation());

        EmployeeDTO emp2 = new EmployeeDTO(1,"홍길동", 19, 'M', "01022223333", "서울 잠실");
        System.out.println("emp[1] : " + emp2.getInformation());

        EmployeeDTO emp3 = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
        System.out.println("emp[2] : " + emp3.getInformation());

        System.out.println("=================================================");

        // 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 출력
        EmployeeDTO[] empDTOs = new EmployeeDTO[]{emp1, emp2, emp3};

        emp1 = new EmployeeDTO(0, "김말똥", "영업부", "팀장", 30, 'M', 3000000, 0.2, "01055559999", "전라도 광주");
        System.out.println("emp[0] : " + emp1.getInformation());

        emp2 = new EmployeeDTO(1, "홍길동", "기획부", "부장", 19, 'M', 4000000, 0.3, "01022223333", "서울 잠실");
        System.out.println("emp[1] : " + emp2.getInformation());

        System.out.println("=================================================");

        // 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
        // 연봉 = (급여 + (급여 * 보너스포인트)) * 12

        System.out.println("김말똥의 연봉 : " + emp1.getYearlySalary() + "원");
        System.out.println("홍길동의 연봉 : " + emp2.getYearlySalary() + "원");
        System.out.println("강말순의 연봉 : " + emp3.getYearlySalary() + "원");

        System.out.println("=================================================");

        System.out.println("직원들의 연봉의 평균 : " + (emp1.getYearlySalary()+emp2.getYearlySalary()+emp3.getYearlySalary()) / 3 + "원");

    }

}
