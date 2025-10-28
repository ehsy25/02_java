package com.E.section06.finalkeyword;

public class FinalFieldTest {
    /* final 키워드를 사용할 수 있는 위치는 다양하다.
     * 1. 지역 변수 : 초기화 이후 값 변경 불가
     * 2. 매개 변수 : 호출 시 전달한 값 변경 불가
     * 3. 인스턴스 변수 : 인스턴스 생성 초기화 이후에 값 변경 불가
     * 4. 클래스 변수(static) : 프로그램 시작 이후 값 변경 불가
     * 5. non-static method : 메소드 재작성(오버라이딩) 불가
     * 6. static method : 메소드 재작성(오버라이딩) 불가
     * 7. 클래스 : 상속 불가
     * */

    /*non-static field에 final 사용하는 경우
    * 초기 인스턴스 생성 시 기본값 0이 필드에 들어가게 되는데
    * 값 변경이 불가능하므로 선언과 동시에 초기화를 해야한다*/

// final은 변경 불가기에, 기본 값 0을 원하더라도 직접 입력해야 한다
// private final int NON_STATIC_NUM;

private final int NONSTATIC_COUNT = 1;
private final String NON_STATIC_NAME;


/*final variables are given default values when not initialized, but we can use
* constructors to initialize a value when creating instances and change them*/
public FinalFieldTest(String nonStaticName){
    this.NON_STATIC_NAME = nonStaticName;
}



private static final String sn;


    static{
        sn = "name";
    }

}
