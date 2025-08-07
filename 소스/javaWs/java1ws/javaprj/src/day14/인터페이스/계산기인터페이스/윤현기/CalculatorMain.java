package day14.인터페이스.계산기인터페이스.윤현기;

public class CalculatorMain {
    public static void main(String[] args) {
        // Calculator 생성
        Calculator calc = new CalculatorImpl();

        // 테스트 할 숫자
        int num1 = 10;
        int num2 = 5;

        // 각 연산
        System.out.println("=== 계산기 연산 결과 ===");
        System.out.println(num1 + " + " + num2 + " = " + calc.add(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + calc.sub(num1, num2));
        System.out.println(num1 + " × " + num2 + " = " + calc.mul(num1, num2));
        System.out.println(num1 + " ÷ " + num2 + " = " + calc.div(num1, num2));

        // 0으로 나눴을때 예외상황 테스트
        System.out.println("\n=== 예외 상황 테스트 ===");
        System.out.println(num1 + " ÷ 0 = " + calc.div(num1, 0));
    }
}
