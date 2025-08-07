package day13.다형성_학생.다형석실습_이정호;

public class Wen extends Pizza {
	@Override
	public void printPizza() {
		super.printPizza();
		System.out.println("=====================");
		System.out.println("오늘의 피자 : 치즈 피자(11,900원)");
		System.out.println();
	}
}
