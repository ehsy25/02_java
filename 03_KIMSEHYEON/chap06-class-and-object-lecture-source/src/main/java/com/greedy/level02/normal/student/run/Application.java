package com.greedy.level02.normal.student.run;
import com.greedy.level02.normal.student.model.vo.*;

public class Application {
    public static void main(String[] args) {
        StudentVO studentVO = new StudentVO(1,"홍길동",2,175.5,'남');

        studentVO.printInformation();
    }

}
