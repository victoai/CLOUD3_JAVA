package day14.인터페이스.계산기인터페이스;

public class 문구점Calculator implements CalculatorI{

	@Override
	public int add(int su1, int su2) {
		// TODO Auto-generated method stub
		return su1 + su2;
	}

	@Override
	public int sub(int su1, int su2) {
		// TODO Auto-generated method stub
		return su1 - su2;
	}
	
}
