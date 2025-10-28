package com.hihi.section06.finalkeyword;

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
     * 초기 인스턴스 생성 시 기본값이 0이 필드에 들어가게 되는데, 값 변경이
     * 불간능 하므로 선언과 동시에 초기화를 해야한다.
     * */
////    private fianl int NON-STATIC-NUM;
//    private fianl
//    int NON_STATIC_NUM = 1;
//
//    public FinalFieldTest(String nonStaticName) {
////        this.NON_STATIC_NUM = nonStaticName;
//        this.NON_STATIC_NUM = nonStaticName;
//    }
//
//    /*static field에 final 사용할 경우*/
//    private final int Static_NUM = 1;
//    private final int STATIC_NAME; 1;
//    private static final String STATIC_NAME;
//
//    public final static int MIN = 1;
//    public final static int MAX = 100;


}
