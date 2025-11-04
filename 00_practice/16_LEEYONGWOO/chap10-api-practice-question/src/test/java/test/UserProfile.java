package test;
public class UserProfile {
    private String username;      // 필수
    private String email;         // 필수
    private Integer age;          // 선택
    private Boolean isPremium;    // 선택
    private Double balance;       // 선택

    // TODO: 생성자 작성 (username, email은 필수)
    public UserProfile(String username, String email) {
        // 여기에 코드 작성
        this.username = username;
        this.email = email;
    }

    /**
     * TODO: 나이가 설정되어 있고 18세 이상이면 true 반환
     * 나이가 null이면 false 반환
     */
    public boolean isAdult() {
        // 여기에 코드 작성
        if(age.intValue()>=18) return true;
        else return false;
    }

    /**
     * TODO: 프리미엄 회원이면 true, 아니면 false
     * isPremium이 null이면 false로 간주
     */
    public boolean isPremiumMember() {
        // 여기에 코드 작성
        if(isPremium.booleanValue()) return true;
        else  return false;
    }

    /**
     * TODO: 잔액에서 amount만큼 차감
     * - balance가 null이면 0으로 초기화 후 차감
     * - 잔액이 부족하면 false 반환
     * - 성공하면 true 반환
     */
    public boolean deduct(double amount) {
        // 여기에 코드 작성
        if(balance==null){
            balance=0.0;
            if((balance-amount)<0) return false;
            else{
                balance-=amount;
                return true;
            }
        }

    /**
     * TODO: 사용자 정보를 보기 좋게 출력
     * 예: "User: john (Premium) - Age: 25, Balance: $100.50"
     * null 값은 "N/A"로 표시
     */
    public String getDisplayInfo() {
        // 여기에 코드 작성

        return "User: "+username+"("+isPremium+") - Age: "+age+", Balance: $"+balance;
    }

    // Getter/Setter 추가
}
}
