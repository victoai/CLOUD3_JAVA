package day14.인터페이스.계산기인터페이스;

public class 다이소Calculator implements CalculatorI{

	@Override
	public int add(int su1, int su2) {
		System.out.println("황지영 - 다이소는 저렴하단 장점이 잇지요?");
		return su1 +su2;
	}

	@Override
	public int sub(int su1, int su2) {
		System.out.println("황지영 - 다이소는 저렴하단 장점이 잇지요?");
		return su1 -su2;
	}

}
