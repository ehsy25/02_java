package com.greedy.level03.hard.emp.run;
import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        EmployeeDTO employeeDTO = new EmployeeDTO();

        int number;
        String name, dept, job, phone, address;
        int age, salary;
        char gender;
        double bonusPoint;



        System.out.print("사번: ");
        number = sc.nextInt();
        sc.nextLine();

        System.out.print("이름: ");
        name = sc.nextLine();

        System.out.print("부서: ");
        dept = sc.nextLine();

        System.out.print("직급: ");
        job = sc.nextLine();

        System.out.print("나이: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("성별(M/F): ");
        gender = sc.nextLine().charAt(0);

        System.out.print("급여: ");
        salary = sc.nextInt();
        sc.nextLine();

        System.out.print("보너스포인트: ");
        bonusPoint = sc.nextDouble();
        sc.nextLine();

        System.out.print("전화번호: ");
        phone = sc.nextLine();

        System.out.print("주소: ");
        address = sc.nextLine();


        // 2. setter를 이용하여 필드 값 변경 (저장)
        // 입력받은 지역 변수의 값을 employeeDTO 객체의 필드에 저장합니다.
        employeeDTO.setNumber(number);
        employeeDTO.setName(name);
        employeeDTO.setDept(dept);
        employeeDTO.setJob(job);
        employeeDTO.setAge(age);
        employeeDTO.setGender(gender);
        employeeDTO.setSalary(salary);
        employeeDTO.setBonusPoint(bonusPoint);
        employeeDTO.setPhone(phone);
        employeeDTO.setAddress(address);

        // 3. getter를 이용하여 모든 필드 값 출력
        System.out.println("\n=== 입력된 직원 정보 출력 ===");
        System.out.println(employeeDTO.getNumber());
        System.out.println(employeeDTO.getName());
        System.out.println(employeeDTO.getDept());
        System.out.println(employeeDTO.getJob());
        System.out.println(employeeDTO.getAge());
        System.out.println(employeeDTO.getGender());
        System.out.println(employeeDTO.getSalary());
        System.out.println(" " + employeeDTO.getBonusPoint()); // 실행 결과 예시 형식 맞춤
        System.out.println(" " + employeeDTO.getPhone());      // 실행 결과 예시 형식 맞춤
        System.out.println(employeeDTO.getAddress());

        sc.close();
    }
}
