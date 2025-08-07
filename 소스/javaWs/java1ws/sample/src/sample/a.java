package sample;

public class a {
    public static void methodC() {
        System.out.println("methodC 실행");
        throw new RuntimeException("methodC에서 예외 발생!");
    }

    public static void methodB() {
        System.out.println("methodB 실행");
        try {
            methodC();
        } catch (RuntimeException e) {
            System.out.println("methodB에서 예외를 다시 던짐: " + e.getMessage());
            throw e;  // 예외 다시 전파
        }
    }

    public static void methodA() {
        System.out.println("methodA 실행");
        try {
            methodB();
        } catch (RuntimeException e) {
            System.out.println("methodA에서 예외를 다시 던짐: " + e.getMessage());
            throw e;  // 예외 다시 전파
        }
    }

    public static void main(String[] args) {
        try {
            methodA();
        } catch (RuntimeException e) {
            System.out.println("main에서 최종 예외 처리: " + e.getMessage());
        }
        System.out.println("프로그램 종료");
    }
}
