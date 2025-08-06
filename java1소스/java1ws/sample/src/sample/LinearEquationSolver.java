package sample;

public class LinearEquationSolver {
    public static void main(String[] args) {
        int maxLimit = 60; // x와 y의 최대 범위 설정
        
        System.out.println("4x + 5y = 60 의 정수 해:");
        for (int x = 0; x <= maxLimit / 4; x++) {
            for (int y = 0; y <= maxLimit / 5; y++) {
                if (4 * x + 5 * y == 60) {
                    System.out.println("x = " + x + ", y = " + y);
                }
            }
        }
    }
}
