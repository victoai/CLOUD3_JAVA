package day12.다형성실습;

public class Thu extends Pizza {
	@Override
	public void printPizza() {
		super.printPizza();
		System.out.println("=====================");
		System.out.println("오늘의 피자 : 페퍼로니 피자(11,900원)");
		System.out.println();
	}
}
