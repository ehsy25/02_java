package com.greedy.level02.normal.student.run;

import com.greedy.level02.normal.student.model.vo.StudentVO;

public class Application {
    public static void main(String[] args) {
        StudentVO sv = new StudentVO(1, 2, "홍길동", 175.5, '남');
        sv.printInformation();


    }
}
