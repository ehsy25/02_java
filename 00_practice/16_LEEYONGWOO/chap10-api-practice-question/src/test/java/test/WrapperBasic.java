package test;
public class WrapperBasic {
    /**
     * TODO: 다음 메서드를 완성하세요
     * 1. int를 Integer로 박싱
     * 2. Integer를 int로 언박싱
     * 3. 두 값을 더한 결과를 반환
     */
    public static int addPrimitiveAndWrapper(int primitive, Integer wrapper) {
        // 여기에 코드 작성
        Integer a1=Integer.valueOf(primitive);
        Integer a2=primitive;
        int A=wrapper.intValue();//자동 언박싱

        return A+a1;
    }

    /**
     * TODO: String을 Integer로 변환하고, 10을 더한 값을 반환
     * 예: "123" -> 133
     * 힌트: Integer.parseInt() 사용
     */
    public static Integer parseAndAdd(String numberStr) {
        // 여기에 코드 작성
        Integer a= Integer.parseInt(numberStr);
        return a+10;
    }

    /**
     * TODO: Integer 배열의 합계를 구하세요
     * null 값은 0으로 처리
     */
    public static int sumWithNull(Integer[] numbers) {
        // 여기에 코드 작성
        int sum=0;
        for(int i=0; i<numbers.length; i++){
            sum+=Integer.valueOf(numbers[i]);
        }
        return sum;
    }
}