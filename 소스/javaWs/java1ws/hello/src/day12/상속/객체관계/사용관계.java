package day12.상속.객체관계;
class Calculator {
    public double add(double value1, double value2) {
        return value1 + value2;
    }
}

class CalculatorService {
    public double calculate(Calculator calculator, double su1, double su2) {
        return calculator.add(su1, su2); // Calculator 객체를 매개변수로 사용
    }
}

public class 사용관계 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(); // 객체 생성
        CalculatorService service = new CalculatorService();

        double result = service.calculate(calculator, 10, 5); // Calculator 객체를 매개변수로 전달
        System.out.println("결과: " + result); // 결과: 15.0
    }
}
