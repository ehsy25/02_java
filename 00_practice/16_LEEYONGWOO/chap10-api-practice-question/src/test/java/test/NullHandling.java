package test;

public class NullHandling {
    /**
     * TODO: 두 Integer를 비교
     * - 둘 다 null이면 0 반환
     * - 하나만 null이면 null이 아닌 값 반환
     * - 둘 다 null이 아니면 더 큰 값 반환
     */
    public static Integer getMax(Integer a, Integer b) {
        // 여기에 코드 작성
        if(a==null && b==null) return 0;
        else if(a==null &&  b!=null) return b;
        else if(a!=null && b==null) return a;
        else{
            return getMax(a,b);
        }
    }

    /**
     * TODO: Integer 값이 null이거나 0이면 기본값을 반환
     * 그렇지 않으면 원래 값을 반환
     */
    public static int getValueOrDefault(Integer value, int defaultValue) {
        // 여기에 코드 작성
        if(value==null || value==0) return defaultValue;
        else return value;
    }
}