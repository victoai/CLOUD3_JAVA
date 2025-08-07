package day14.인터페이스.계산기인터페이스;

public class PaulCalculator implements CalculatorI {

	@Override
	public int add(int su1, int su2) {
		System.out.println("백바울이 더합니다");
		return su1 + su2;
	}

	@Override
	public int sub(int su1, int su2) {
		System.out.println("백바울이 뺍니다");
		return su1 - su2;
	}

}
