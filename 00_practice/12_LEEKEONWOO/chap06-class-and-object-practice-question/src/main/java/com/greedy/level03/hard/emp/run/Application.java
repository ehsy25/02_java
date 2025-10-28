package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        //스캐너를 이용하여 직원 정보 입력
        Scanner sc = new Scanner(System.in);

        System.out.print("number 입력 : ");
        int number = sc.nextInt();

        System.out.print("name 입력 : ");
        String name = sc.next();

        System.out.print("dept 입력 : ");
        String dept = sc.next();

        System.out.print("job 입력 : ");
        String job = sc.next();

        System.out.print("age 입력 : ");
        int age = sc.nextInt();

        System.out.print("gender 입력 : ");
        char gender = sc.next().charAt(0);

        System.out.print("salary 입력 : ");
        int salary = sc.nextInt();

        System.out.print("bonusPoint 입력 : ");
        double bonusPoint = sc.nextDouble();

        System.out.print("phone 입력 : ");
        String phone = sc.next();

        System.out.print("address 입력 : ");
        String address = sc.next();

        //기본 생성자로 인스턴스 생성
        EmployeeDTO employee = new EmployeeDTO();

        //setter 이용하여 필드값 변경
        employee.setNumber(number);
        employee.setName(name);
        employee.setDept(dept);
        employee.setJob(job);
        employee.setAge(age);
        employee.setGender(gender);
        employee.setSalary(salary);
        employee.setBonusPoint(bonusPoint);
        employee.setPhone(phone);
        employee.setAddress(address);

        //getter 이용하여 필드값 출력
        System.out.println(employee.getNumber());
        System.out.println(employee.getName());
        System.out.println(employee.getDept());
        System.out.println(employee.getJob());
        System.out.println(employee.getAge());
        System.out.println(employee.getGender());
        System.out.println(employee.getSalary());
        System.out.println(employee.getBonusPoint());
        System.out.println(employee.getPhone());
        System.out.println(employee.getAddress());
    }
}
