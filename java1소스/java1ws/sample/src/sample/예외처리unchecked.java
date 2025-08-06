package sample;

public class 예외처리unchecked {

    public static void main(String[] args) {
        try {
            // 예외를 발생시키는 메서드 호출
            checkAge(15);  // 18세 미만인 경우 예외 발생
        } catch (IllegalArgumentException e) {
            // 예외 처리
            System.out.println("예외 발생:!!! " + e.getMessage());
        }
    }

    // 나이가 18세 이상인지 확인하는 메서드
    public static void checkAge(int age) {
        if (age < 18) {
            // 조건에 맞지 않으면 예외를 발생시킴
            throw new IllegalArgumentException("18세 이상만 참여 가능합니다.");
        }
        System.out.println("나이 확인 완료: " + age + "세");
    }
}
