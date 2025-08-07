package day14.인터페이스.계산기인터페이스.윤현기;


public class CalculatorImpl implements Calculator {
            @Override
            public int add(int su1, int su2) {
                return su1 + su2;
            }

            @Override
            public int sub(int su1, int su2) {
                return su1 - su2;
            }

            @Override
            public int mul(int su1, int su2) {
                return su1 * su2;
            }

            @Override
            public int div(int su1, int su2) {
                if (su2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return 0;
                }
                return su1 / su2;
            }
        }
