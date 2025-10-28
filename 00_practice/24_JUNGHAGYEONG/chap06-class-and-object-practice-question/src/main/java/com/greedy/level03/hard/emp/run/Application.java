package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        //스캐너를 이용해서 모든 직원 정보를 입력 받아
        //기본 생성자로 인스턴스 생성 후 setter를 이용하여 필드 값 변경 후
        //getter를 이용하여 모든 필드 값 출력

        Scanner scanner = new Scanner(System.in);
        EmployeeDTO employeeDTO = new EmployeeDTO();

        System.out.print("사원 번호 : ");
        employeeDTO.setNumber(scanner.nextInt());
        scanner.nextLine();
        System.out.print("이름 : ");
        employeeDTO.setName(scanner.nextLine());
        System.out.print("부서 : ");
        employeeDTO.setDept(scanner.nextLine());
        System.out.print("직급 : ");
        employeeDTO.setJob(scanner.nextLine());
        System.out.print("나이 : ");
        employeeDTO.setAge(scanner.nextInt());
        scanner.nextLine();
        System.out.print("성별 : ");
        employeeDTO.setGender(scanner.next().charAt(0));
        System.out.print("월급 : ");
        employeeDTO.setSalary(scanner.nextInt());
        scanner.nextLine();
        System.out.print("보너스 : ");
        employeeDTO.setBonuspoint(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("전화번호 : ");
        employeeDTO.setPhone(scanner.nextLine());
        System.out.print("주소 : ");
        employeeDTO.setAddress(scanner.nextLine());

        System.out.println(employeeDTO.getNumber());
        System.out.println(employeeDTO.getName());
        System.out.println(employeeDTO.getDept());
        System.out.println(employeeDTO.getJob());
        System.out.println(employeeDTO.getAge());
        System.out.println(employeeDTO.getGender());
        System.out.println(employeeDTO.getBonuspoint());
        System.out.println(employeeDTO.getPhone());
        System.out.println(employeeDTO.getAddress());

    }
}
