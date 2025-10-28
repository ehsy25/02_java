package com.ohgiraffers.section03.overriding;

public class SubClass extends SuperClass {

    /*
    - 오버라이딩 성립 조건
    1. 메소드명 동일
    2. 메소드 리턴 타입 동일
    3. 매개변수의 타입, 개수, 순서가 동일
    4. 부모 클래스의 private 메소드는 오버라이딩 불가능
    5. 부모 클래스의 final 키워드가 사용된 메소드는 오버라이딩 불가능
    6. 접근 제어자는 부모 메소드와 같거나 더 넓은 범위여야 함
    7. 예외처리는 같은 예외이거나 더 구체적(하위)인 예외를 처리해야 함
    */

    /* 메소드 명, 리턴 타입, 매개 변수 개수 & 타입 & 순서 일치해야 함*/

    @Override
    public void method(int num) {}

    /* 안되는 경우 */
//    @Override
//    public void method(String num) {}
//    public int method(int num) {return 0;}
//    public void method2(int num) {}

    /* private 메소드 오버라이딩 불가 */
//    @Override
    private void privateMethod() {} // 재정의 x, 자식 클래스에서 독자적으로 생성

    /* final 메소드 오버라이딩 불가 */
//    @Override
//    public void finalMethod() {}

    /* protected 메소드 오버라이딩 가능 */
//    @Override
    /* protected -> default로 변경 : 보다 좁은 범위로 변경은 불가*/
//    void protectedMethod() {} -> 접근 제어자는 부모와 같거나 더 넓어야 함
//    protected void protectedMethod() {}

    /* protected -> public로 변경 : 보다 넓은 범위로 변경은 가능*/
    @Override
    public void protectedMethod() {}
}
