package com.ohgiraffers.exception.number;

public class Run {

    public static void main(String[] args) {
try{
    Run run = new Run();
    run.test(-1,3);
}catch(NumberRangeException e){
    e.getStackTrace();
    System.out.println("1부터 100사이의 값이 아닙니다.");
}
    }

    public void test(int a, int b) throws NumberRangeException{
        NumberProcess np = new NumberProcess();
        if(np.checkDouble(a, b)){
            System.out.println(" a is a multiple of b");
        }else {
            System.out.println(" a is not a multiple of b");
            throw  new NumberRangeException();
        }
    }

}
