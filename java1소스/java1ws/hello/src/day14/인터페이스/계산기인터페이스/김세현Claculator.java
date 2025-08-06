package day14.인터페이스.계산기인터페이스;

public class 김세현Claculator implements CalculatorI{

	@Override
	public int add(int su1, int su2) {
		System.out.println("KshCalculator");
		return su1+su2;
	}

	@Override
	public int sub(int su1, int su2) {
		System.out.println("KshCalculator");
		return su1-su2;
	}

}
