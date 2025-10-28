package com.greedy.level03.hard.emplyoee.run;

import com.greedy.level03.hard.emplyoee.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        EmployeeDTO dto = new EmployeeDTO();
        Scanner sc = new Scanner(System.in);
        System.out.print("직원 정보(number)를 입력해주세요 : ");
        int number = sc.nextInt();
        dto.setNumber(number);
        System.out.print("직원 정보(name)를 입력해주세요 : ");
        String name = sc.nextLine();
        dto.setName(name);
        sc.nextLine();
        System.out.print("직원 정보(dept)를 입력해주세요 : ");
        String dept = sc.nextLine();
        dto.setDept(dept);
        System.out.print("직원 정보(job)를 입력해주세요 : ");
        String job = sc.nextLine();
        dto.setJob(job);
        System.out.print("직원 정보(age)를 입력해주세요 : ");
        int age = sc.nextInt();
        dto.setAge(age);
        sc.nextLine();
        System.out.print("직원 정보(gender)를 입력해주세요 : ");
        char gender = sc.nextLine().charAt(0);
        dto.setGender(gender);
        System.out.print("직원 정보(salary)를 입력해주세요 : ");
        int salary = sc.nextInt();
        dto.setSalary(salary);
        sc.nextLine();
        System.out.print("직원 정보(bonusPoint)를 입력해주세요 : ");
        double bonusPoint = sc.nextDouble();
        dto.setBonusPoint(bonusPoint);
        sc.nextLine();
        System.out.print("직원 정보(phone)를 입력해주세요 : ");
        String phone = sc.nextLine();
        dto.setPhone(phone);
        System.out.print("직원 정보(address)를 입력해주세요 : ");
        String address = sc.nextLine();
        dto.setAddress(address);


        System.out.println(dto.toString());

    }
}