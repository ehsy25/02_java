package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

public class Application {
    public static void main(String[] args) {
        EmployeeDTO ed = new EmployeeDTO();
        ed.setNumber(200);
        ed.setName("홍길동");
        ed.setDept("영업부");
        ed.setJob("과장");
        ed.setAge(20);
        ed.setGender('남');
        ed.setSalary(2000000);
        ed.setBonusPoint(0.5);
        ed.setPhone("010-1234-5678");
        ed.setAddress("서울시 서초구 서초동");

        System.out.println(ed.getNumber());
        System.out.println(ed.getName());
        System.out.println(ed.getDept());
        System.out.println(ed.getJob());
        System.out.println(ed.getAge());
        System.out.println(ed.getGender());
        System.out.println(ed.getSalary());
        System.out.println(ed.getBonusPoint());
        System.out.println(ed.getPhone());
        System.out.println(ed.getAddress());
    }
}
